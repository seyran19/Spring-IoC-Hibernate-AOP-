package Repeat.AOP.Before_And_Aspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            Book book = context.getBean("book", Book.class);

            System.out.println(book.getAuthor());
            System.out.println(book.getTitle());
        }

    }
}
