package udemy.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import udemy.learnspringframework.game.GameRunner;
import udemy.learnspringframework.game.GamingConsole;
import udemy.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
