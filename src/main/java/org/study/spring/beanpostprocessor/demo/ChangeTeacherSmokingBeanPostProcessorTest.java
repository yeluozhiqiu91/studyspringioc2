package org.study.spring.beanpostprocessor.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 15:44
 */
public class ChangeTeacherSmokingBeanPostProcessorTest {
    @Test
    public void test2() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-post-processor-teacher.xml");
        Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
        teacher.teach();
    }
}
