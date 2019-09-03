package org.study.spring.beanfactorypostprocessor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.spring.beanpostprocessor.demo.Teacher;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 16:27
 */
public class ChangeTeacherBeanFactoryPostProcessorTest {
    @Test
    public void test2() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-post-processor-teacher2.xml");
        Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
        teacher.teach();

    }
}
