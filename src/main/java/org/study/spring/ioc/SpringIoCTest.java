package org.study.spring.ioc;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 11:32
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIoCTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        SayService sayService = (SayService)applicationContext.getBean("test");
        sayService.say();
    }

}
