tiny-IoC
=====

步骤：

## 1.step1-最基本的容器
*step-1-container-register-and-get*
简单做k,v 的映射和取值操作
单纯的map，有get和put bean的功能


## 2.step2-inject
*step-2-abstract-beanfactory-and-do-bean-initilizing-in-it*

1. 抽象beanfactory
2. 将bean初始化放入beanfactory
3. 实现bean的多种方式注入,以 Object bean, Class beanClass, String beanClassName 三种方式实现类的注册和获取
4. 在AutowireCapableBeanFactory里面实现bean的获取动作

## 3.step3-为bean注入属性
*step-3-inject-bean-with-property*
