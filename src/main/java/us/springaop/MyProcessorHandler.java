package us.springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zzr
 */
public class MyProcessorHandler implements InvocationHandler {


    private Advice advice;

    private Object target;

    public MyProcessorHandler(Object target ,Advice advice){
        this.target = target;
        this.advice = advice;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        advice.beforeMethod();
        Object reVal = method.invoke(target, args);
        advice.afterMethod();
        return reVal;
    }
}
