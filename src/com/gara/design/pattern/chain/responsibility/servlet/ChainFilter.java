package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description ChainFilter
 * @Date 2020/9/6 16:06
 * @Version V1.0.0
 **/
public interface ChainFilter {

    boolean doFilter(Filter.ServletRequest request, Filter.ServletResponse response);

    ChainFilter add(Filter filter);
//    Filter getNext();
}
