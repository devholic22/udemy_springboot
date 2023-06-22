package udemy.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import udemy.learnspringframework.game.GameRunner;
import udemy.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
