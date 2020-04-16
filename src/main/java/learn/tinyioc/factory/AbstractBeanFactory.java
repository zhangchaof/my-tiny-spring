package learn.tinyioc.factory;

import learn.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 11:05
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception{
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
