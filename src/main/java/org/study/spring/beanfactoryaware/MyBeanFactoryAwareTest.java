package org.study.spring.beanfactoryaware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 18:08
 */
public class MyBeanFactoryAwareTest {
    @Test
    public void test2() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-factory-aware.xml");
        MyBeanFactoryAware mybeanFactoryAware = applicationContext.getBean("mybeanFactoryAware",MyBeanFactoryAware.class);
    }
}
