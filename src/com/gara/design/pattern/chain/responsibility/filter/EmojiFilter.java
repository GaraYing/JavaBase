package com.gara.design.pattern.chain.responsibility.filter;

import com.gara.design.pattern.chain.responsibility.Message;

/**
 * @Author GARA
 * @Description EmojiFilter
 * @Date 2020/9/6 15:27
 * @Version V1.0.0
 **/
public class EmojiFilter implements Filter {
    @Override
    public boolean doFilter(Message message) {

        String msg = message.getMsg();
        String s = msg.replace("😄", "^_^");
        message.setMsg(s);
        return true;
    }
}
