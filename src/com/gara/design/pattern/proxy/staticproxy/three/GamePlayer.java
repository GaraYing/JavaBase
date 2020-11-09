package com.gara.design.pattern.proxy.staticproxy.three;

/**
 * @Author GARA 具体玩家实现
 * @Description
 * @Date 2020/11/8 16:26
 * @Version V1.0.0
 **/
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

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
        if (this.isProxy()){
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");
        }else {
            System.out.println("请使用指定的代理放访问");
        }

    }

    @Override
    public void beatMonster() {
        if (this.isProxy()){
            System.out.println(this.name + "在打怪兽");
        }else {
            System.out.println("请使用指定的代理放访问");
        }

    }

    @Override
    public void getGrade() {
        if (this.isProxy()){
            System.out.println(this.name + "得分");
        }else {
            System.out.println("请使用指定的代理放访问");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
        if (this.proxy == null){
            return false;
        }else {
            return true;
        }
    }
}
