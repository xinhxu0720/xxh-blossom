import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSONObject;
import com.blossom.backend.APP;
import com.blossom.backend.server.picture.PictureMapper;
import com.blossom.backend.server.picture.pojo.PictureEntity;
import com.blossom.common.base.util.DateUtils;
import com.blossom.common.base.util.PrimaryKeyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = APP.class)
public class Excaml {



    @Resource
    private PictureMapper pictureMapper;



    @Test
    public void start() {
        List<getTikTok> getTikToks = JSONObject.parseArray(getTikTok.a, getTikTok.class);

        // 指定父文件夹路径和新文件夹名称
        for (getTikTok getTikTok : getTikToks) {
            new Thread(() -> getVideo(getTikTok.getType(), getTikTok.getName())).start();
        }
    }

    @Test
    public void getVideo(Integer type, String name) {
        String newFolderName = type + "_" + name;
        Integer num = 0;
        while (true) {
            System.out.println("===========================================第" + num + newFolderName + "条视频开始");

            String toYMDHMS = DateUtils.toYMD(new Date());

            long nextId = PrimaryKeyUtil.nextId();
            String fileName = nextId + "_" + toYMDHMS + ".mp4";


            String newFolderPath = Paths.get("H:\\A视频大全", newFolderName).toString();
            try {
                String urlString = "https://api.zxz.ee/api/video/?format=&type=" + type;
                Map<String, List<String>> headers = fetchResponseHeaders(urlString);

                // 尝试从headers中获取Location字段
                List<String> locations = headers.get("Location");
                if (locations != null && !locations.isEmpty()) {

                    String url = locations.get(0);
                    URL redirectUrl = new URL(url);


                    HttpURLConnection redirectConnection = (HttpURLConnection) redirectUrl.openConnection();
                    redirectConnection.setRequestMethod("GET");

                    int responseCode = redirectConnection.getResponseCode();

                    System.out.println("Response Code: " + responseCode);

                    PictureEntity pic = new PictureEntity();
                    pic.setUserId(10003L);
                    pic.setId(PrimaryKeyUtil.nextId());
                    pic.setPid(414214056106537920L);
                    String sourceName = extractBetweenComAndQuestionMark(url);
                    // 文件原名
                    pic.setSourceName(sourceName);
                    pic.setName(fileName);


                    String contentLength = redirectConnection.getHeaderField("Content-Length");
                    long fileSize = Long.parseLong(contentLength);

                    pic.setSize(fileSize);
                    // 文件后缀, 后缀无法修改
                    pic.setSuffix(FileUtil.getSuffix(pic.getSourceName()));
                    pic.setPathName("/home/bl/img/U10003/" + fileName);
                    pic.setUrl("http://47.92.146.49:9999/" + pic.getPathName());
                    Map<String, Object> map = new HashMap();
                    map.put("source_name", sourceName);

                    List<PictureEntity> pictureEntities = pictureMapper.selectByMap(map);
                    if (Objects.nonNull(pictureEntities) && !pictureEntities.isEmpty()) {
                        System.out.println("重复视频................" + JSONObject.toJSONString(pic));
                        return;
                    }
                    System.out.println(JSONObject.toJSONString(pic));

                    // 打开输出文件流
                    try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newFolderPath))) {
                        // 打开输入流来读取服务器响应
                        try (InputStream inputStream = redirectConnection.getInputStream()) {
                            byte[] buffer = new byte[4096]; // 缓冲区大小可以根据需要调整
                            int bytesRead;

                            // 读取响应数据并写入到文件
                            while ((bytesRead = inputStream.read(buffer)) != -1) {
                                outputStream.write(buffer, 0, bytesRead);
                            }

                            // 完成后刷新输出流
                            outputStream.flush();
                            System.out.println("Video stream saved to " + newFolderPath);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        return;
                    }
                    redirectConnection.disconnect(); // 断开当前连接

                    pictureMapper.insert(pic);
                    System.out.println("===========================================第" + num + newFolderName + "条视频结束");
                    num += 1;
                } else {
                    throw new Exception("发生异常");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static Map<String, List<String>> fetchResponseHeaders(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 设置不跟随重定向
        connection.setInstanceFollowRedirects(false);

        // 发送请求
        connection.connect();

        // 获取响应码
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // 获取响应头信息
        Map<String, List<String>> headers = connection.getHeaderFields();

        // 断开连接
        connection.disconnect();

        return headers;

    }


    public static String extractBetweenComAndQuestionMark(String url) {
        // 找到com的位置
        int comIndex = url.indexOf(".com");
        if (comIndex == -1) {
            throw new IllegalArgumentException("No '.com' found in the URL.");
        }

        // 找到?的位置
        int questionMarkIndex = url.indexOf("?", comIndex + 4); // +4是为了跳过".com"
        if (questionMarkIndex == -1) {
            // 如果没有找到?，则提取到字符串末尾
            return url.substring(comIndex + 4);
        }

        // 截取com之后到?之前的部分
        return url.substring(comIndex + 4, questionMarkIndex);
    }
}
