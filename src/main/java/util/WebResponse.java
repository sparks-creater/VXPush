package util;

import java.io.Serializable;

public class WebResponse
        <T> implements Serializable {

    public WebResponse() {
    }

    public static final int SUCCESS = 200;
    public static final int ERROR = 500;

    public final static String HTTP_200_SUCCESS = "OK";
    public final static String HTTP_500_ERROR = "ERR";

    private int status = SUCCESS;
    private String message = "";
    private T rt;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getRt() {
        return rt;
    }

    public void setRt(T rt) {
        this.rt = rt;
    }

    /**
     * 成功返回
     *
     * @return
     */
    public static WebResponse ok() {
        WebResponse webResponse = new WebResponse();
        webResponse.setStatus(SUCCESS);
        webResponse.setMessage(HTTP_200_SUCCESS);
        return webResponse;
    }

    public static <V> WebResponse
            <V> ok(V v) {
        WebResponse webResponse = new WebResponse();
        webResponse.setStatus(SUCCESS);
        webResponse.setMessage(HTTP_200_SUCCESS);
        webResponse.setRt(v);
        return webResponse;
    }

    public static <V> WebResponse
            <V> ok(V v, String message) {
        WebResponse webResponse = new WebResponse();
        webResponse.setStatus(SUCCESS);
        webResponse.setMessage(message);
        webResponse.setRt(v);
        return webResponse;
    }

    /**
     * 返回错误
     *
     * @return
     */
    public static WebResponse error() {
        WebResponse webResponse = new WebResponse();
        webResponse.setRt(ERROR);
        webResponse.setMessage(HTTP_500_ERROR);
        return webResponse;
    }

    public static WebResponse error(int code) {
        WebResponse webResponse = new WebResponse();
        webResponse.setRt(code);
        webResponse.setMessage(HTTP_500_ERROR);
        return webResponse;
    }

    public static WebResponse error(int code, String message) {
        WebResponse webResponse = new WebResponse();
        webResponse.setStatus(code);
        webResponse.setMessage(message);
        return webResponse;
    }
}