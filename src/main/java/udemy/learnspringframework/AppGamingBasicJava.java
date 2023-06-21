package udemy.learnspringframework;

import udemy.learnspringframework.game.GameRunner;
import udemy.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
