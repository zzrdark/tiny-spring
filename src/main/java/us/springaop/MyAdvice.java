package us.springaop;

/**
 * @author zzr
 */
public class MyAdvice implements Advice {
    @Override
    public void beforeMethod() {
        System.out.println("beforeMethod!!!");
    }

    @Override
    public void afterMethod() {
        System.out.println("afterMethod!!!");
    }
}
