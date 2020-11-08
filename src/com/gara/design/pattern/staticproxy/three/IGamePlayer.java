package com.gara.design.pattern.staticproxy.three;

/**
 * @Author GARA
 * @Description 游戏玩家
 * @Date 2020/11/8 16:24
 * @Version V1.0.0
 **/
public interface IGamePlayer {
    /**
     * 登录
     * @param name
     * @param pwd
     */
    void login(String user, String pwd);

    /**
     * 打怪兽
     */
    void beatMonster();

    /**
     * 升级
     */
    void getGrade();

    /**
     * 获取代理对象
     * @return
     */
    public IGamePlayer getProxy();
}
