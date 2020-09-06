package com.gara.design.pattern.chain.responsibility.chain;

import com.gara.design.pattern.chain.responsibility.Message;
import com.gara.design.pattern.chain.responsibility.filter.Filter;
import com.sun.org.apache.xml.internal.security.algorithms.MessageDigestAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author GARA
 * @Description FilterChain
 * @Date 2020/9/6 15:34
 * @Version V1.0.0
 **/
public class FilterChain implements Filter{

    private List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Message message){
        for (Filter filter : filters) {
            if (!filter.doFilter(message)) return false;
        }
        return true;
    }
}
