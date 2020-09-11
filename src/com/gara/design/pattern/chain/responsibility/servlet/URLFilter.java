package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description HtmlFilter
 * @Date 2020/9/6 16:11
 * @Version V1.0.0
 **/
public class URLFilter implements Filter {

    @Override
    public boolean doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("into URLFilter >>>>>>>>>");
        if (request.getStr().contains("http")){
            String replace = request.getStr().replace("http", "https");
            request.setStr(replace);
        }
        return false;
    }
}
