package udemy.learnspringframework;

import udemy.learnspringframework.game.GameRunner;
import udemy.learnspringframework.game.MarioGame;
import udemy.learnspringframework.game.PacmanGame;
import udemy.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
