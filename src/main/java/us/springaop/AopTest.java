package us.springaop;

import java.io.InputStream;

/**
 * @author zzr
 */
public class AopTest {
    public static void main(String[] args) {
        InputStream ips = AopTest.class.getResourceAsStream("conf.properties");
        Object bean = new BeanFactory(ips).getBean("aop");
        System.out.println(bean.getClass().getName());
        ((MyObjectInterface)bean).print();
    }
}
