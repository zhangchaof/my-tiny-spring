package com.learn.ioc;

import com.learn.ioc.service.HelloServiceImpl;
import learn.tinyioc.BeanDefinition;
import learn.tinyioc.factory.AutowireCapableBeanFactory;
import learn.tinyioc.factory.BeanFactory;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 10:05
 */
public class BeanFactoryTest {

    public static void main(String[] args) {
        // 1.初始化beanfactory(系统行为)
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入bean(系统行为)
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.learn.ioc.service.HelloServiceImpl");
        beanFactory.registerBeanDefinition("helloServiceImpl", beanDefinition);

        // 3.获取bean(用户行为)
        HelloServiceImpl helloService = (HelloServiceImpl) beanFactory.getBean("helloServiceImpl");
        helloService.hello();

    }
}
