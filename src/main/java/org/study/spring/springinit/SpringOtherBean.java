package org.study.spring.springinit;

/**
 * @Author: wangliujie
 * @Date: 2019/9/4 9:01
 */
public class SpringOtherBean {
    private String name;

    public void say(){
        System.out.println("say: I am "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
