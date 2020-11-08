package com.gara.design.pattern.staticproxy.two;

/**
 * @Author GARA
 * @Description 游戏代理商
 * @Date 2020/11/8 16:36
 * @Version V1.0.0
 **/
public class GameProxy implements IGamePlayer {

    private GamePlayer gamePlayer = null;

    public GameProxy(String name) {
        try {
            gamePlayer = new GamePlayer(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String pwd) {
        this.gamePlayer.login(user, pwd);
    }

    @Override
    public void beatMonster() {
        this.gamePlayer.beatMonster();
    }

    @Override
    public void getGrade() {
        this.gamePlayer.getGrade();
    }
}
