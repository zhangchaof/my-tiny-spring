package com.learn.ioc;

import com.learn.ioc.service.HelloService;
import com.learn.ioc.service.ZhangHelloServiceImpl;
import learn.tinyioc.BeanDefinition;
import learn.tinyioc.BeanFactory;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 10:05
 */
public class IocTest {

    public static void main(String[] args) {
        // 1.初始化beanfactory(系统行为)
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean(系统行为)
        BeanDefinition beanDefinition = new BeanDefinition(new ZhangHelloServiceImpl());
        beanFactory.registerBeanDefinition("zhangHelloServiceImpl", beanDefinition);

        // 3.获取bean(用户行为)
        HelloService helloService = (ZhangHelloServiceImpl) beanFactory.getBean("zhangHelloServiceImpl");
        helloService.hello();

    }
}
