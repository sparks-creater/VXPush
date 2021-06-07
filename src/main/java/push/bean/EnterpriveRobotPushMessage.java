package push.bean;



import lombok.AllArgsConstructor;

import java.util.List;

public class EnterpriveRobotPushMessage {
    private final static String MSG_TYPE_TXT = "txt";
    private final static String MSG_TYPE_MAKEDOWN = "makedown";
    private final static String MSG_TYPE_IMAGE = "image";
    private final static String MSG_TYPE_ARTICLE = "article";
    private final static String MSG_TYPE_ARTICLES = "articles";

    private int robotId;
    private String type;

    private Txt txt;
    private Makedown makedown;
    private Image image;
    private Article article;
    private Articles articles;

    //文本类
    @AllArgsConstructor
    public class Txt{
        private String content;     //文本内容
        private List<String> montioned_list;    //提醒指定人员
        private List<String> montioned_mobile_list;     //提醒手机号为指定范围内的人员
    }
    //makedown类
    @AllArgsConstructor
    public class Makedown{
        private String content; //makedown内容
    }
    //图片类
    @AllArgsConstructor
    public class Image{
        private String base64;  //图片的base64值
        private String md5; //图片（base64前）的MD5码
    }
    //单图文类
    @AllArgsConstructor
    public class Article{
        private String title;   //图文标题
        private String description; //描述
        private String url; //点击后跳转的链接
        private String picurl;  //图片链接
    }
    //多图文类
    @AllArgsConstructor
    public class Articles{
        private List<Article> articles;
    }

    //各类构造方法
}
