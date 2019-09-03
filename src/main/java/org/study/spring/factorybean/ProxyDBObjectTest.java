package org.study.spring.factorybean;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 17:30
 */
public class ProxyDBObjectTest {
    @Test
    public void test2() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory-bean.xml");
        /*DBOperation dBoperation =  applicationContext.getBean("proxyDB",DBOperation.class);
        MysqlDBEntity dbEntity = new MysqlDBEntity();
        dBoperation.save(dbEntity);*/
        FactoryBean factoryBean = applicationContext.getBean("&proxyDB",FactoryBean.class);
        DBOperation dbOperation = (DBOperation) factoryBean.getObject();
        MysqlDBEntity dbEntity = new MysqlDBEntity();
        dbOperation.save(dbEntity);
    }
}
