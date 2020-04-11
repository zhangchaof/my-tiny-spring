package learn.tinyioc;

/**
 * @author clark
 * @Description:
 * @date 2020/4/11 19:07
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
