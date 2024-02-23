import java.util.Scanner;

public class Dragon {
    static int x, y;
    static int width = 10;
    static int height = 10;
    static boolean running = false;

    void moveLeft() {
        x--;
    }

    void moveRight() {
        x++;
    }

    void moveDown() {
        y--;
    }

    void moveUp() {
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
    

    void detectCollision(int x, int y) {
        if (x < 0 || y < 0 || x > width || y > height) {
            System.out.println("Game over!");
            running = false;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        running = true;
        while (running) {
            printPosition();
            String command = input.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("a")) {
                Dragon dragon = new Dragon();
                dragon.moveLeft();
                dragon.detectCollision(dragon.x, dragon.y);
            } else if (command.equalsIgnoreCase("d")) {
                Dragon dragon = new Dragon();
                dragon.moveRight();
                dragon.detectCollision(dragon.x, dragon.y);
            } else if (command.equalsIgnoreCase("s")) {
                Dragon dragon = new Dragon();
                dragon.moveDown();
                dragon.detectCollision(dragon.x, dragon.y);
            } else if (command.equalsIgnoreCase("w")) {
                Dragon dragon = new Dragon();
                dragon.moveUp();
                dragon.detectCollision(dragon.x, dragon.y);
            }
        }
        
    }
}
