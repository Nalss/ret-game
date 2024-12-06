import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JComponent implements KeyListener {

    static int x = 500;
    static int y = 500;
    static int width = 50;
    static int height = 80;
    static byte speed = 20;

    public void update() {
    }

    //Draw player
    public void draw(Graphics g, int panelWidth, int panelHeight) {
        // Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, panelWidth, panelHeight);

        // Player
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
