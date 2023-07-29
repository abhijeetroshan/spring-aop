package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void afterLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println("After Loggers");
    }
}
