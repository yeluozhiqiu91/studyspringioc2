package org.study.spring.beanpostprocessor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 16:11
 */
public class ChangeConfigSupportMultiEnvironmentTest {
    @Test
    public void test2() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-post-processor.xml");
        DataSourceConnection dataSourceConnection = applicationContext.getBean("dataSourceConnection",DataSourceConnection.class);
        dataSourceConnection.initConnection();

    }
}
