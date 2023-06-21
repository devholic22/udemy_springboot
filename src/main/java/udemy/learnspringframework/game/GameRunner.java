package udemy.learnspringframework.game;

public class GameRunner {
    // MarioGame game;
    private SuperContraGame game;

    public GameRunner(SuperContraGame game) { // MarioGame -> SuperContraGame
        this.game = game;
    }

    public void run() {

        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
