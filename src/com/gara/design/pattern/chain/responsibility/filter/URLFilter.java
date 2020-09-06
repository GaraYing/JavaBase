package com.gara.design.pattern.chain.responsibility.filter;

import com.gara.design.pattern.chain.responsibility.Message;

/**
 * @Author GARA
 * @Description URLFillter
 * @Date 2020/9/6 15:26
 * @Version V1.0.0
 **/
public class URLFilter implements Filter {
    @Override
    public boolean doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("baidu.com", "https://www.baidu.com");
        message.setMsg(msg);
        return true;
    }
}
