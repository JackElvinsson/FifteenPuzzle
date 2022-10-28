import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    GameMethods gameMethods = new GameMethods();
    int[][] gameArray;

    // Buttons
    JButton button00 = new JButton("");
    JButton button01 = new JButton("");
    JButton button02 = new JButton("");
    JButton button03 = new JButton("");
    JButton button10 = new JButton("");
    JButton button11 = new JButton("");
    JButton button12 = new JButton("");
    JButton button13 = new JButton("");
    JButton button20 = new JButton("");
    JButton button21 = new JButton("");
    JButton button22 = new JButton("");
    JButton button23 = new JButton("");
    JButton button30 = new JButton("");
    JButton button31 = new JButton("");
    JButton button32 = new JButton("");
    JButton button33 = new JButton("");


    JButton newGame = new JButton("New game");

    // Panels
    JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
    JPanel topPanel = new JPanel(new GridLayout(1, 1));
    JPanel gameCompletePanel = new JPanel(new FlowLayout());

    // Labels
    JLabel gameComplete = new JLabel("");

    public GUI() {

        topPanel.add(newGame);

        buttonPanel.add(button00);
        buttonPanel.add(button01);
        buttonPanel.add(button02);
        buttonPanel.add(button03);
        buttonPanel.add(button10);
        buttonPanel.add(button11);
        buttonPanel.add(button12);
        buttonPanel.add(button13);
        buttonPanel.add(button20);
        buttonPanel.add(button21);
        buttonPanel.add(button22);
        buttonPanel.add(button23);
        buttonPanel.add(button30);
        buttonPanel.add(button31);
        buttonPanel.add(button32);
        buttonPanel.add(button33);

        gameCompletePanel.add(gameComplete);

        // GUI
        setLayout(new BorderLayout());
        add("North", topPanel);
        add("Center", buttonPanel);
        add("South", gameCompletePanel);

        button00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 0)) {

                    gameMethods.MoveBox(0, 0);
                    button00.setText(String.valueOf(gameArray[0][0]));
                }
            }
        });

        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 1)) {

                    gameMethods.MoveBox(0, 1);
                    button01.setText(String.valueOf(gameArray[0][1]));
                }
            }
        });
        button02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 2)) {

                    gameMethods.MoveBox(0, 2);
                    button02.setText(String.valueOf(gameArray[0][2]));
                }

            }
        });
        button03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 3)) {

                    gameMethods.MoveBox(0, 3);
                    button03.setText(String.valueOf(gameArray[0][3]));
                }

            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 0)) {

                    gameMethods.MoveBox(1, 0);
                    button10.setText(String.valueOf(gameArray[1][0]));
                }

            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 1)) {

                    gameMethods.MoveBox(1, 1);
                    button11.setText(String.valueOf(gameArray[1][1]));
                }

            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 2)) {

                    gameMethods.MoveBox(1, 2);
                    button12.setText(String.valueOf(gameArray[1][2]));
                }

            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 3)) {

                    gameMethods.MoveBox(1, 3);
                    button13.setText(String.valueOf(gameArray[1][3]));
                }

            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 0)) {

                    gameMethods.MoveBox(2, 0);
                    button20.setText(String.valueOf(gameArray[2][0]));
                }

            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 1)) {

                    gameMethods.MoveBox(2, 1);
                    button21.setText(String.valueOf(gameArray[2][1]));
                }

            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 2)) {

                    gameMethods.MoveBox(2, 2);
                    button22.setText(String.valueOf(gameArray[2][2]));
                }

            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 3)) {

                    gameMethods.MoveBox(2, 3);
                    button23.setText(String.valueOf(gameArray[2][3]));
                }

            }
        });
        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 0)) {

                    gameMethods.MoveBox(3, 0);
                    button30.setText(String.valueOf(gameArray[3][0]));
                }

            }
        });
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 1)) {

                    gameMethods.MoveBox(3, 1);
                    button31.setText(String.valueOf(gameArray[3][1]));
                }

            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 2)) {

                    gameMethods.MoveBox(3, 2);
                    button32.setText(String.valueOf(gameArray[3][2]));
                }

            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 3)) {

                    gameMethods.MoveBox(3, 3);
                    button33.setText(String.valueOf(gameArray[3][3]));
                }

            }
        });

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameArray = gameMethods.NewGame();

                button00.setText(String.valueOf(gameArray[0][0]));
                button01.setText(String.valueOf(gameArray[0][1]));
                button02.setText(String.valueOf(gameArray[0][2]));
                button03.setText(String.valueOf(gameArray[0][3]));
                button10.setText(String.valueOf(gameArray[1][0]));
                button11.setText(String.valueOf(gameArray[1][1]));
                button12.setText(String.valueOf(gameArray[1][2]));
                button13.setText(String.valueOf(gameArray[1][3]));
                button20.setText(String.valueOf(gameArray[2][0]));
                button21.setText(String.valueOf(gameArray[2][1]));
                button22.setText(String.valueOf(gameArray[2][2]));
                button23.setText(String.valueOf(gameArray[2][3]));
                button30.setText(String.valueOf(gameArray[3][0]));
                button31.setText(String.valueOf(gameArray[3][1]));
                button32.setText(String.valueOf(gameArray[3][2]));
                button33.setText(String.valueOf(gameArray[3][3]));

                gameMethods.testGame();

            }
        });


        pack();
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}

