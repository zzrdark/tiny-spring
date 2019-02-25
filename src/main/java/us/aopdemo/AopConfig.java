package us.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zzr
 * 编写一个配置类（用于开启spring对aspectJ的）：
 */

@Configuration
@ComponentScan("us.aopdemo")
@EnableAspectJAutoProxy
public class AopConfig {
}
