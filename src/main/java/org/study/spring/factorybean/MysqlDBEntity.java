package org.study.spring.factorybean;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 17:24
 */
public class MysqlDBEntity extends DBEntity{
    private String attribute;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
