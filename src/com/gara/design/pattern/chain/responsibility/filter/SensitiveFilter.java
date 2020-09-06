package com.gara.design.pattern.chain.responsibility.filter;

import com.gara.design.pattern.chain.responsibility.Message;

/**
 * @Author GARA
 * @Description SensitiveFilter
 * @Date 2020/9/6 15:21
 * @Version V1.0.0
 **/
public class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("911", "000");
        message.setMsg(msg);
        return false;
    }
}
