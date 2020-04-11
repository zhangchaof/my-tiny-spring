package learn.tinyioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author clark
 * @Description:
 * @date 2020/4/11 19:10
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void regiserBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
