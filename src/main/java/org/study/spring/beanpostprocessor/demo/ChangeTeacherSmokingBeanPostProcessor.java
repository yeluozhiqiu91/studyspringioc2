package org.study.spring.beanpostprocessor.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: wangliujie
 * @Date: 2019/9/3 15:41
 */
public class ChangeTeacherSmokingBeanPostProcessor implements BeanPostProcessor {
    /**
     * 初始化之前处理
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        /**
         * 只处理该bean的类型是Teacher的
         */
        if(bean instanceof Teacher){
            Teacher teacher = (Teacher)bean;
            /**
             * 实例化之前，要吧所有抽烟的都改成不抽烟的
             */
            if(teacher.isSmoking()){
                ((Teacher)bean).setTempSmoking(false);
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        return bean;
    }
}
