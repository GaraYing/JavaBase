package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description 利用责任链模式自定义实现ServletFilter，
 *              要求: Filter顺序处理Request请求，然后逆序处理返回Response
 * @Date 2020/9/6 16:12
 * @Version V1.0.0
 **/
public class Main {
    public static void main(String[] args) {
        HtmlFilter htmlFilter = new HtmlFilter();

        URLFilter urlFilter = new URLFilter();

        ChainFilter chainFilter = new DefaultChainFilter(htmlFilter);
        chainFilter.add(urlFilter);

        Filter.ServletRequest request = new Filter.ServletRequest("请求测试测试12123");

        Filter.ServletResponse response = new Filter.ServletResponse("相应测试测试21231212");

        chainFilter.doFilter(request, response);
    }
}
