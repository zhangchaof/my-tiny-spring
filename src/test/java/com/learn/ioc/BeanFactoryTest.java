package com.learn.ioc;

import com.learn.ioc.service.HelloWorldService;
import learn.tinyioc.BeanDefinition;
import learn.tinyioc.PropertyValue;
import learn.tinyioc.PropertyValues;
import learn.tinyioc.factory.AutowireCapableBeanFactory;
import learn.tinyioc.factory.BeanFactory;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 10:05
 */
public class BeanFactoryTest {

    public static void main(String[] args) throws Exception {
        // 1.初始化beanfactory(系统行为)
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入bean(系统行为)
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.learn.ioc.service.HelloWorldService");
        // 3.设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4.生成bean
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 5.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }
}
