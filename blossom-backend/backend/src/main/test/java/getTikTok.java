import com.alibaba.fastjson.JSONObject;
import com.blossom.common.base.util.okhttp.HttpUtil;
import lombok.Data;
import org.assertj.core.util.Lists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class getTikTok {
    private int type;
    private String name;


    public getTikTok(int type, String name) {
        this.type = type;
        this.name = name;
    }


    public static final String a = "[{\"type\":\"1\",\"name\":\"甩裙系列\"},\n" +
            "{\"type\":\"2\",\"name\":\"又纯又欲\"},\n" +
            "{\"type\":\"3\",\"name\":\"黑白双煞\"},\n" +
            "{\"type\":\"4\",\"name\":\"猫系女友\"},\n" +
            "{\"type\":\"5\",\"name\":\"硬气卡点\"},\n" +
            "{\"type\":\"6\",\"name\":\"微胖系列\"},\n" +
            "{\"type\":\"7\",\"name\":\"安慕希系\"},\n" +
            "{\"type\":\"8\",\"name\":\"帅哥系列\"},\n" +
            "{\"type\":\"9\",\"name\":\"女仆系列\"},\n" +
            "{\"type\":\"10\",\"name\":\"腹肌变装\"},\n" +
            "{\"type\":\"11\",\"name\":\"白丝视频\"},\n" +
            "{\"type\":\"12\",\"name\":\"黑丝视频\"},\n" +
            "{\"type\":\"13\",\"name\":\"御姐系列\"},\n" +
            "{\"type\":\"14\",\"name\":\"二次元系\"},\n" +
            "{\"type\":\"15\",\"name\":\"擦玻璃系\"},\n" +
            "{\"type\":\"16\",\"name\":\"蹲下变装\"},\n" +
            "{\"type\":\"17\",\"name\":\"吊带系列\"},\n" +
            "{\"type\":\"18\",\"name\":\"背影变装\"},\n" +
            "{\"type\":\"19\",\"name\":\"火车摇系\"},\n" +
            "{\"type\":\"20\",\"name\":\"完美身材\"},\n" +
            "{\"type\":\"21\",\"name\":\"晴天推荐\"},\n" +
            "{\"type\":\"22\",\"name\":\"你的欲梦\"},\n" +
            "{\"type\":\"23\",\"name\":\"萝莉系列\"},\n" +
            "{\"type\":\"24\",\"name\":\"光剑变装\"},\n" +
            "{\"type\":\"25\",\"name\":\"动漫视频\"},\n" +
            "{\"type\":\"26\",\"name\":\"余震系列\"},\n" +
            "{\"type\":\"27\",\"name\":\"新纯系列\"},\n" +
            "{\"type\":\"28\",\"name\":\"三真香系\"},\n" +
            "{\"type\":\"29\",\"name\":\"原神系列\"},\n" +
            "{\"type\":\"30\",\"name\":\"甜妹系列\"},\n" +
            "{\"type\":\"31\",\"name\":\"漫画芋系\"},\n" +
            "{\"type\":\"32\",\"name\":\"潇潇系列\"},\n" +
            "{\"type\":\"33\",\"name\":\"玉足美腿\"},\n" +
            "{\"type\":\"34\",\"name\":\"清纯系列\"},\n" +
            "{\"type\":\"35\",\"name\":\"慢摇系列\"},\n" +
            "{\"type\":\"36\",\"name\":\"萌娃系列\"},\n" +
            "{\"type\":\"37\",\"name\":\"COS系列\"},\n" +
            "{\"type\":\"38\",\"name\":\"周扬青系\"},\n" +
            "{\"type\":\"39\",\"name\":\"周清欢系\"},\n" +
            "{\"type\":\"40\",\"name\":\"安琪系列\"},\n" +
            "{\"type\":\"41\",\"name\":\"清风皓月\"},\n" +
            "{\"type\":\"42\",\"name\":\"杂鱼川系\"},\n" +
            "{\"type\":\"43\",\"name\":\"琳铛系列\"},\n" +
            "{\"type\":\"44\",\"name\":\"惠子系列\"},\n" +
            "{\"type\":\"45\",\"name\":\"蛋儿系列\"},\n" +
            "{\"type\":\"46\",\"name\":\"吧啦鲨系\"},\n" +
            "{\"type\":\"47\",\"name\":\"Yume系列\"},\n" +
            "{\"type\":\"48\",\"name\":\"Kiki系列\"},\n" +
            "{\"type\":\"49\",\"name\":\"钰钰系列\"},\n" +
            "{\"type\":\"50\",\"name\":\"小瑾系列\"},\n" +
            "{\"type\":\"51\",\"name\":\"燕酱系列\"},\n" +
            "{\"type\":\"52\",\"name\":\"桥本环菜\"},\n" +
            "{\"type\":\"53\",\"name\":\"少萝系列\"},\n" +
            "{\"type\":\"54\",\"name\":\"鹿婷系列\"},\n" +
            "{\"type\":\"55\",\"name\":\"李逍遥系\"},\n" +
            "{\"type\":\"56\",\"name\":\"空心柚七\"},\n" +
            "{\"type\":\"57\",\"name\":\"菜狗系列\"},\n" +
            "{\"type\":\"58\",\"name\":\"昭昭系列\"},\n" +
            "{\"type\":\"59\",\"name\":\"桃桃系列\"},\n" +
            "{\"type\":\"60\",\"name\":\"擦边系列\"},\n" +
            "{\"type\":\"61\",\"name\":\"摇摇系列\"}]";

}