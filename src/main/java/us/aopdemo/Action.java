package us.aopdemo;

import java.lang.annotation.*;

/**
 * @author zzr
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
