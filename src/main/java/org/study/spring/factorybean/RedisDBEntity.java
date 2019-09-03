package org.study.spring.factorybean;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 17:26
 */
public class RedisDBEntity extends DBEntity{
    private String jsonStr;

    public String getJsonStr() {
        return jsonStr;
    }

    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }
}
