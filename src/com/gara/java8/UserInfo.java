package com.gara.java8;


/**
 * @author GARA
 */
public class UserInfo {

    private  Integer age;

    private String name;

    private  Integer sex;

    private String hobby;

    public UserInfo() {
    }

    public UserInfo(Integer age, String name, Integer sex, String hobby) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
