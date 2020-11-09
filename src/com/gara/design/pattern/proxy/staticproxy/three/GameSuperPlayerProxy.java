package com.gara.design.pattern.proxy.staticproxy.three;

/**
 * @Author GARA
 * @Description 游戏代理商
 * @Date 2020/11/8 16:36
 * @Version V1.0.0
 **/
public class GameSuperPlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GameSuperPlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代理登录
     * @param user
     * @param pwd
     */
    @Override
    public void login(String user, String pwd) {
        this.gamePlayer.login(user, pwd);
    }

    /**
     * 代理打怪
     */
    @Override
    public void beatMonster() {
        this.gamePlayer.beatMonster();
    }

    /**
     * 代理上分
     */
    @Override
    public void getGrade() {
        this.gamePlayer.getGrade();
    }

    /**
     * 代理的代理暂叶还没有，就是自己
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
