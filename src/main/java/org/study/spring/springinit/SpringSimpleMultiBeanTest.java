package org.study.spring.springinit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 18:46
 */
public class SpringSimpleMultiBeanTest {
    @Test
    public void test2() throws Exception{

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-init.xml");
        SpringSimpleMultiBean bean = applicationContext.getBean("springMultiBean",SpringSimpleMultiBean.class);
        bean.say();

		 SpringOtherBean springOtherBean = applicationContext.getBean("springOtherBean",SpringOtherBean.class);
		 springOtherBean.say();
    }
}
