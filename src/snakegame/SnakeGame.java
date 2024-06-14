package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("SNAKE GAME");
        add(new Board());

        pack();

        setSize(500, 500);

        setLocationRelativeTo(null);

        setResizable(false);

    }

    public static void main(String[] args) {

        new SnakeGame().setVisible(true);

    }

}
