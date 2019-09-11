package org.study.spring.ioc;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 11:31
 */
public class SayService {
    private String mouth;

    public void say(){
        System.out.println("I am Spring");
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }
}
