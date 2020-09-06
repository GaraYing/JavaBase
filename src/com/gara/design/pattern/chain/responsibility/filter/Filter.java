package com.gara.design.pattern.chain.responsibility.filter;

import com.gara.design.pattern.chain.responsibility.Message;

/**
 * @Author GARA
 * @Description Filter接口
 * @Date 2020/9/6 15:20
 * @Version V1.0.0
 **/
public interface Filter {

    /**
     * 链处理方法
     * @param message
     * @return
     */
    boolean doFilter(Message message);
}
