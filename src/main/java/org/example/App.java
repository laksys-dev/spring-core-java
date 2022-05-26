package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("----------main begins-------");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        
        Customer c1 = ctx.getBean(Customer.class);
        System.out.println(c1);

        ((AnnotationConfigApplicationContext)ctx).close();
        System.out.println("-----------main ends--------");
    }
}
