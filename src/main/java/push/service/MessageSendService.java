package push.service;

import util.WebResponse;

public interface MessageSendService<T>{
    public WebResponse send(T msg) throws Exception;
}
