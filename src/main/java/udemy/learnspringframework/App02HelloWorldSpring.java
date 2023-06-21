package udemy.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // 1: Launch a Spring Context
        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring to manage
        System.out.println(context.getBean("name"));
    }
}
