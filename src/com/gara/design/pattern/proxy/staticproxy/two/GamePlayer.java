package com.gara.design.pattern.proxy.staticproxy.two;

/**
 * @Author GARA 具体玩家实现
 * @Description
 * @Date 2020/11/8 16:26
 * @Version V1.0.0
 **/
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    // 构造函数限制谁能创过对象，并同时传追姓名
    public GamePlayer(IGamePlayer iGamePlayer, String name) throws Exception {
        if (iGamePlayer == null){
            throw  new Exception("不能创建真实角色！！");
        }else{
            this.name = name;
        }

    }

    @Override
    public void login(String user, String pwd) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");
    }

    @Override
    public void beatMonster() {
        System.out.println(this.name + "在打怪兽");
    }

    @Override
    public void getGrade() {
        System.out.println(this.name + "得分");
    }
}
