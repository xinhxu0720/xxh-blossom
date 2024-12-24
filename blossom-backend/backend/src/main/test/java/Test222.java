import com.alibaba.fastjson.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Test222 {

    public static void main(String[] args) {
        String videoUrlString = "https://api.yujn.cn/api/manzhan.php";
        try {
            URL videoUrl = new URL(videoUrlString);
            HttpURLConnection connection = (HttpURLConnection) videoUrl.openConnection();
            connection.setRequestMethod("GET");

            // 获取响应码，确保请求成功
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 获取内容类型，虽然不是文件名但有助于确定媒体类型
                String contentType = connection.getContentType();
                System.out.println("Content Type: " + contentType);
                Map<String, List<String>> headerFields = connection.getHeaderFields();

                System.out.println(JSONObject.toJSONString(headerFields));
                // 尝试从Content-Disposition头中获取文件名（如果服务器提供了的话）
                String contentDisposition = connection.getHeaderField("Content-Disposition");

                if (contentDisposition != null && contentDisposition.contains("filename")) {
                    String fileName = contentDisposition.replaceAll(".*filename=\"?([^\";]*)\"?.*", "$1");
                    System.out.println("File Name: " + fileName);
                } else {
                    // 如果Content-Disposition头中没有文件名，你可能需要其他方式来获取或生成一个文件名
                    System.out.println("File Name not provided in Content-Disposition header.");
                }


                // 获取文件大小（Content-Length头）
                String contentLength = connection.getHeaderField("Content-Length");
                if (contentLength != null) {
                    long fileSize = Long.parseLong(contentLength);
                    System.out.println("File Size: " + fileSize + " bytes");
                } else {
                    System.out.println("File Size not provided in Content-Length header.");
                }

                // 如果需要，可以获取InputStream来处理视频流
                // InputStream inputStream = connection.getInputStream();

            } else {
                System.out.println("Failed to retrieve video info. HTTP response code: " + responseCode);
            }

            // 总是关闭连接
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
