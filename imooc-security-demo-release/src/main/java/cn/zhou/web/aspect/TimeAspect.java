package cn.zhou.web.aspect;

import cn.zhou.dto.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class TimeAspect {


    @Around("execution(* cn.zhou.controller.UserController.*(..))")
    public Object handleController(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before aspect ");

        Object[] args = pjp.getArgs();
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Object object = pjp.proceed();
//        object 是执行完controller 后 返回的值
        if(object instanceof User){
            User user = (User)object;
            System.out.println(user);
        }
        System.out.println("after aspect");
        return object;
    }

}
