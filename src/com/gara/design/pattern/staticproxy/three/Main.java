package com.gara.design.pattern.staticproxy.three;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 16:45
 * @Version V1.0.0
 **/
public class Main {

    public static void main(String[] args) throws Exception {

        IGamePlayer player = new GamePlayer("张三");

        player.login("zhangsan","**********");
        player.beatMonster();
        player.getGrade();
        // 获取指定代理
        IGamePlayer proxy = player.getProxy();
        proxy.login("zhangsan","**********");
        proxy.beatMonster();
        proxy.getGrade();

        // 代理嵌套
        IGamePlayer proxyProxy = proxy.getProxy();
        proxyProxy.login("sss","1212");
        proxyProxy.beatMonster();
        proxyProxy.getGrade();
    }
}
