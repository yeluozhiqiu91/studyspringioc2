package org.study.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 17:28
 */
public class ProxyDBObject implements FactoryBean<Object> {

    private String currentDB;


    public String getCurrentDB() {
        return currentDB;
    }

    public void setCurrentDB(String currentDB) {
        this.currentDB = currentDB;
    }

    public Object getObject() throws Exception {
        if("mysql".equals(currentDB)){
            return new MysqlDB();
        }
        return new RedisDB();
    }

    public Class<?> getObjectType() {
        if("mysql".equals(currentDB)){
            return MysqlDB.class;
        }
        return RedisDB.class;
    }

    public boolean isSingleton() {
        return false;
    }




}
