package Repeat.AOP.Before_And_Aspects.Aspects;

import Repeat.AOP.Before_And_Aspects.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinPointExample {
    @Before("Repeat.AOP.Before_And_Aspects.PountCuts.PointCut.forGetTitle()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {

            Object[] args = joinPoint.getArgs();

            for (Object arg : args) {
                if (arg instanceof Book book) {
                    System.out.println(
                            "Book title: " + book.getTitle() +
                                    "\nBook author: " + book.getAuthor() +
                                    "\nBook pages " + book.getPages()
                    );
                } else if (arg instanceof String s) {
                    System.out.println(s + " has added this book to the library");
                }
            }
        }

        System.out.println("-A- forGetTitle");

    }
}
