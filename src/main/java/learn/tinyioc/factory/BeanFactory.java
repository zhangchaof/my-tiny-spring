package learn.tinyioc.factory;

import learn.tinyioc.BeanDefinition;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 11:01
 */
public interface BeanFactory {
    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
