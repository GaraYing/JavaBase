package com.gara.design.pattern.chain.responsibility;

import com.gara.design.pattern.chain.responsibility.chain.FilterChain;
import com.gara.design.pattern.chain.responsibility.filter.*;

/**
 * @Author GARA
 * @Description Main
 * @Date 2020/9/6 15:20
 * @Version V1.0.0
 **/
public class Main {

    public static void main(String[] args) {
        String inputMsg = "你好，<script> 这是怎么回事？😀😀，我的主页是: baidu.com, 911恐怖袭击";
        Message message = new Message();
        message.setName("闸板");
        message.setMsg(inputMsg);

        FilterChain fc  = new FilterChain();
        fc.addFilter(new HtmlFilter())
                .addFilter(new SensitiveFilter());

        FilterChain anotherFc = new FilterChain();
        anotherFc.addFilter(new URLFilter())
                .addFilter(new EmojiFilter());
        fc.addFilter(anotherFc);

        fc.doFilter(message);

        System.out.println(message.toString());
    }

}
