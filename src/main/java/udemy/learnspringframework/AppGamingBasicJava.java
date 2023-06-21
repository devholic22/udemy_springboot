package udemy.learnspringframework;

import udemy.learnspringframework.game.GameRunner;
import udemy.learnspringframework.game.MarioGame;
import udemy.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var marioGame = new MarioGame();
        // var gameRunner = new GameRunner(marioGame);

        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);

        gameRunner.run();
    }
}
