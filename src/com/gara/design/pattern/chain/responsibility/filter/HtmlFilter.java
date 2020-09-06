package com.gara.design.pattern.chain.responsibility.filter;

import com.gara.design.pattern.chain.responsibility.Message;

/**
 * @Author GARA
 * @Description HtmlFilter
 * @Date 2020/9/6 15:21
 * @Version V1.0.0
 **/
public class HtmlFilter implements Filter {

    @Override
    public boolean doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("<", "[");
        msg = msg.replace(">", "]");
        message.setMsg(msg);
        return true;
    }
}
