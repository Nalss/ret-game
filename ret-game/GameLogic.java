import javax.swing.*;
import java.awt.*;

public class GameLogic extends JComponent {

    Player player = new Player();

    public void startGame() {
        tickSpeed(60);
        
    }

    public void tickSpeed(int ticks) {
        int tickSpeed = 100000 / ticks;
        Timer timer = new Timer(tickSpeed, e -> {
            update(); //Update game state
            repaint();
        });
        timer.start();
    }

    public void update() {
        repaint();

    }
    //Paint the game components
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        player.draw(g, getWidth(), getHeight());
    }
}
