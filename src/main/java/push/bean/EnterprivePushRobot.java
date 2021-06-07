package push.bean;

public class EnterprivePushRobot {
    private static final String DEFAULTPUSHURL="";
    private Long id;
    private String robotName;
    private String pushUrl;
    private Long uid;
    private int status;

    public static String getDEFAULTPUSHURL() {
        return DEFAULTPUSHURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
