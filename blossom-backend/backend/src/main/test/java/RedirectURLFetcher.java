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
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = APP.class)
public class RedirectURLFetcher {

}
