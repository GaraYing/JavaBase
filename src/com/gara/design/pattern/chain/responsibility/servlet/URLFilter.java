package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description HtmlFilter
 * @Date 2020/9/6 16:11
 * @Version V1.0.0
 **/
public class URLFilter implements Filter {

    private final ChainFilter chain;

    public URLFilter() {
        this.chain = null;
    }

    @Override
    public boolean doFilter(ServletRequest request, ServletResponse response, ChainFilter chainFilter) {
        System.out.println("into URLFilter --------- ");
        String requestStr = request.getStr();

        boolean flag = true;
        while (chainFilter != null && flag){
            flag = chainFilter.doFilter(request, response);
            chainFilter = chain;
        }
        return true;
    }
}
