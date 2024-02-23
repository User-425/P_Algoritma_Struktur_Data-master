import javax.swing.*;
import java.awt.event.*;

public class DragonAdvanced {
    static int x = 0;
    static int y = 0;
    static int width = 10;
    static int height = 10;
    static boolean running = true;

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveDown() {
        y--;
    }

    public void moveUp() {
        y++;
    }

    public static void printPosition() {
        System.out.println("-".repeat((width + 2) * 2));
        for (int i = 0; i < height; i++) {
            String leftSide = " ".repeat(x * 2);
            String rightSide = " ".repeat((width - x) * 2);
            if (height - 1 - y == i) {
                System.out.println("|" + leftSide + "++" + rightSide + "|");
            } else {
                System.out.println("|" + leftSide + "  " + rightSide + "|");
            }
        }
        System.out.println("-".repeat((width + 2) * 2));
        System.out.println("X = " + x + ", Y = " + y);
    }

    public void detectCollision(int x, int y) {
        System.out.println("Detecting X: " + x + " Y: " + y);
        if (x < 0 || y < 0 || x > width || y > height) {
            running = false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dragon Game");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Dragon Controller");

        panel.add(label);
        frame.add(panel);
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.setFocusable(true);

        DragonAdvanced dragon = new DragonAdvanced();

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    dragon.moveLeft();
                    dragon.detectCollision(dragon.x, dragon.y);
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    dragon.moveRight();
                    dragon.detectCollision(dragon.x, dragon.y);
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    dragon.moveDown();
                    dragon.detectCollision(dragon.x, dragon.y);
                } else if (keyCode == KeyEvent.VK_UP) {
                    dragon.moveUp();
                    dragon.detectCollision(dragon.x, dragon.y);
                }

                if (!running) {
                    System.out.println("Game Over, dead at: X: " + dragon.x + " Y: " + dragon.y);
                    System.exit(0);
                }else{
                    printPosition();
                }
            }
        });
    }
}
