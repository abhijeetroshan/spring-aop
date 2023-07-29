package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointcut() {
    }


    @Pointcut("within(demo..*)")
    public void authorizationPointcut() {
    }

    @Before("authenticatingPointcut() || authorizationPointcut()")
    //@Before("execution(* demo.ShoppingCart.checkout(..))")
    public void authorisation(JoinPoint joinPoint) {
        System.out.println("Authorisation is called " + joinPoint.getKind());
    }
}
