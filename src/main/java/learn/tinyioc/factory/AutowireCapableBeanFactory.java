package learn.tinyioc.factory;

import learn.tinyioc.BeanDefinition;
import learn.tinyioc.PropertyValue;
import learn.tinyioc.PropertyValues;

import java.lang.reflect.Field;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 11:12
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        setProperties(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void setProperties(Object bean, BeanDefinition definition) throws Exception{
        PropertyValues propertyValueList = definition.getPropertyValues();
        for(PropertyValue propertyValue: propertyValueList.getPropertyValues()) {
            String name = propertyValue.getName();
            Object value = propertyValue.getValue();
            Field field = bean.getClass().getDeclaredField(name);
            field.setAccessible(true);
            field.set(bean, value);
        }
    }
}
