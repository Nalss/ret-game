import javax.swing.JFrame;

public class Main extends GameLogic{
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        GameLogic GameLogic = new GameLogic();
        GameLogic.startGame();

    }
}
