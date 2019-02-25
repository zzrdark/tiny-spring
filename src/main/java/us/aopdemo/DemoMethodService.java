package us.aopdemo;

import org.springframework.stereotype.Service;

/**
 * @author zzr
 * 方法规则的被拦截类
 */

@Service
public class DemoMethodService {
    public void add() {
        System.out.println("DemoMethodService.add()");
    }
}
