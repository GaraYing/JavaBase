package com.gara.design.pattern.chain.responsibility.servlet;

/**
 * @Author GARA
 * @Description Filter
 * @Date 2020/9/6 16:05
 * @Version V1.0.0
 **/
public interface Filter {

    public boolean doFilter(ServletRequest request, ServletResponse response, ChainFilter chainFilter);

//    ChainFilter getNext();

    class ServletRequest{
        String str;

        public ServletRequest(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

    class ServletResponse{
        String str;

        public ServletResponse(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}
