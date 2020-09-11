package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description HtmlFilter
 * @Date 2020/9/6 16:11
 * @Version V1.0.0
 **/
public class HtmlFilter implements Filter {

    @Override
    public boolean doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("into HtmlFilter >>>>>>");
        if (request.getStr().contains("hehe")){
            String replace = request.getStr().replace("hehe", "haha");
            request.setStr(replace);
        }
        return true;
    }
}
