package us.springaop;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zzr
 * 获取bean  并且 同时注入带通知切面
 */
public class BeanFactory {
    Properties prop = new Properties();

    public BeanFactory(InputStream ips){
        try {
            prop.load(ips);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String name){
        String className = prop.getProperty(name);
        Object bean = null;
        try {
            Class clazz = Class.forName(className);
            bean = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (bean instanceof ProxyFactoryBean) {
            Object proxy = null;
            try {
                ProxyFactoryBean proxyFactoryBean = (ProxyFactoryBean)bean;
                Advice advice = (Advice)Class.forName(prop.getProperty("advice")).newInstance();
                Object target = Class.forName(prop.getProperty("target")).newInstance();
                proxyFactoryBean.setAdvice(advice);
                proxyFactoryBean.setTarget(target);
                proxy = proxyFactoryBean.getProxy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return proxy;
        }
        return bean;
    }

}
