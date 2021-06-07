package push.service.impl;

import push.bean.EnterpriveRobotPushMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import push.service.EnterpriceWechatRobotMessageSendService;
import util.WebResponse;


public class EnterpriceWechatRobotMessageSendServiceImpl implements EnterpriceWechatRobotMessageSendService {
    Logger log = LoggerFactory.getLogger(EnterpriceWechatRobotMessageSendServiceImpl.class);

    //推送消息
    @Override
    public WebResponse send(EnterpriveRobotPushMessage msg) throws Exception {
        return null;
    }
}
