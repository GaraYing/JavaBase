package com.gara.design.pattern.chain.responsibility.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 递归思想实现责任链传递
 * @author: GaraYing
 * @createTime: 2020/9/7 15:05
 * @Version: 1.0
 **/
public class FilterChain implements Filter {

    public List<Filter> filters = new ArrayList<>();

    @Override
    public boolean doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        for (Filter filter : filters) {
            if (!filter.doFilter(request, response, this)) return false;
        }
        return true;
    }


    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }
}
