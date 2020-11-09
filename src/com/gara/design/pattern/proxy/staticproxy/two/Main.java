package com.gara.design.pattern.proxy.staticproxy.two;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 16:45
 * @Version V1.0.0
 **/
public class Main {

    public static void main(String[] args) throws Exception {

        IGamePlayer proxy = new GameProxy("张三");

        proxy.login("zhangsan","**********");
        proxy.beatMonster();
        proxy.getGrade();

        IGamePlayer player = new GamePlayer(proxy,"zz");
        player.login("zz","**********");
        player.beatMonster();
        player.getGrade();
    }
}
