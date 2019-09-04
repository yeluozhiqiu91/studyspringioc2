package org.study.spring.beanfactoryaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 18:07
 */
public class MyBeanFactoryAware implements BeanFactoryAware {
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("I belong to ："+beanFactory);
    }
}
