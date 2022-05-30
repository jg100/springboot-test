package com.example.movierec;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.Bean;

/**
 * Interface defines callback methods that provide instantiation logic,
 * dependancy resolution logic,
 *
 * Can be used to imp custom logic AFTER Spring is done initing, configing.
 *
 *
 * ApplicationContext automatically detect beans that have been defined with
 * BeanPostProcessor
 */

//BeanPostProcessor implements the ordered interface

public class InitUser implements BeanPostProcessor {
    /**
     *
     * Functions used to perform operations/logic before and after init
     *
     * @param bean
     * @param beanName
     * @return Any obj can be returned
     * @throws BeansException
     */
    public Object postProcessBeforeInit(Object bean, String beanName) throws
            BeansException {
        System.out.println("***Before init: " + beanName);

        return bean;
    }

    public Object postProcessAfterInit(Object bean, String beanName) throws BeansException {
        System.out.println("***After init: " + beanName);

        return bean;
    }


}
