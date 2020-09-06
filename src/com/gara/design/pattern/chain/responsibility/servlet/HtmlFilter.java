package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description HtmlFilter
 * @Date 2020/9/6 16:11
 * @Version V1.0.0
 **/
public class HtmlFilter implements Filter {

    private final ChainFilter chain;

    public HtmlFilter() {
        this.chain = new DefaultChainFilter(this);
    }

    @Override
    public boolean doFilter(ServletRequest request, ServletResponse response, ChainFilter chainFilter) {
        System.out.println("into HtmlFilter ++++++++++ ");
        String requestStr = request.getStr();
        boolean flag = true;
        while (chainFilter != null && flag){
            flag = chainFilter.doFilter(request, response);
            chainFilter = chain;
        }
        return true;
    }
}
