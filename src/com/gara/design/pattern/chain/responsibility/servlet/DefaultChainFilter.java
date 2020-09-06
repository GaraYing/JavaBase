package com.gara.design.pattern.chain.responsibility.servlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author GARA
 * @Description DefaultChainFilter
 * @Date 2020/9/6 17:07
 * @Version V1.0.0
 **/
public class DefaultChainFilter implements ChainFilter {


    private final List<Filter> allFilters = new ArrayList<>();

    private final Filter currentFilter;


    public DefaultChainFilter(Filter currentFilter) {
        allFilters.add(currentFilter);
        this.currentFilter = currentFilter;
    }

    @Override
    public ChainFilter add(Filter filter) {
        allFilters.add(filter);
        return this;
    }


    @Override
    public boolean doFilter(Filter.ServletRequest request, Filter.ServletResponse response) {
        return currentFilter.doFilter(request, response, this);
    }
}
