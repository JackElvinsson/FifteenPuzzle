import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {

    //Skapar upp ett gameMethods objekt för att komma åt metoder
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


    JButton newGame = new JButton("Nytt spel");
    JButton testGame = new JButton("Testspel");


    // Panels
    JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
    JPanel topPanel = new JPanel(new GridLayout(1, 2));
    JPanel gameCompletePanel = new JPanel(new FlowLayout());


    // Labels
    JLabel gameComplete = new JLabel("");

    public GUI() {

        // Ändrar utseende
        try {
            UIManager.setLookAndFeel(new SynthLookAndFeel());
        }catch (UnsupportedLookAndFeelException e) {
            System.out.println("Ett fel inträffade");
        }

        // Lägger till komponenter till paneler
        Font fontTop = new Font("Mangal", Font.BOLD, 20);
        topPanel.add(newGame).setFont(fontTop);
        topPanel.add(testGame).setFont(fontTop);

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

        // GUI - Lägger till paneler till frame
        setLayout(new BorderLayout());
        add("North", topPanel);
        add("Center", buttonPanel);
        add("South", gameCompletePanel);



        // ActionListener's som kollar om knappen vi trycker på ligger på en plats som kan "byta plats" med 0-knappen
        // Om sant, byter dessa text (0-knappen "flyttas")
        button00.addActionListener(e -> {

            if (gameMethods.IsValidMove(0, 0)) {

                gameMethods.MoveBox(0, 0,gameArray);
                setButtonNumbers();
            }
        });


        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 1)) {

                    gameMethods.MoveBox(0, 1,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 2)) {

                    gameMethods.MoveBox(0, 2,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(0, 3)) {

                    gameMethods.MoveBox(0, 3,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 0)) {

                    gameMethods.MoveBox(1, 0,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 1)) {

                    gameMethods.MoveBox(1, 1,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 2)) {

                    gameMethods.MoveBox(1, 2,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(1, 3)) {

                    gameMethods.MoveBox(1, 3,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 0)) {

                    gameMethods.MoveBox(2, 0,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 1)) {

                    gameMethods.MoveBox(2, 1,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 2)) {

                    gameMethods.MoveBox(2, 2,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(2, 3)) {

                    gameMethods.MoveBox(2, 3,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 0)) {

                    gameMethods.MoveBox(3, 0,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 1)) {

                    gameMethods.MoveBox(3, 1,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 2)) {

                    gameMethods.MoveBox(3, 2,gameArray);
                    setButtonNumbers();
                }
            }
        });


        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gameMethods.IsValidMove(3, 3)) {

                    gameMethods.MoveBox(3, 3,gameArray);
                    setButtonNumbers();
                }
            }
        });


        // Skapar upp ett nytt, slumpat spel
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameArray = gameMethods.NewGame();
                setButtonNumbers();
//                gameMethods.testGame(gameArray);
            }
        });

        // Skapar upp ett förbestämt testspel
        testGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameArray = gameMethods.TestGame();
                setButtonNumbers();
//                gameMethods.testGame(gameArray);
            }
        });

        pack();
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // Uppdatering av knappar
    protected void setButtonNumbers() {

        Font font = new Font("Mangal", Font.BOLD, 30);

        button00.setText(String.valueOf(gameArray[0][0]));
        button00.setFont(font);

        button01.setText(String.valueOf(gameArray[0][1]));
        button01.setFont(font);

        button02.setText(String.valueOf(gameArray[0][2]));
        button02.setFont(font);

        button03.setText(String.valueOf(gameArray[0][3]));
        button03.setFont(font);

        button10.setText(String.valueOf(gameArray[1][0]));
        button10.setFont(font);

        button11.setText(String.valueOf(gameArray[1][1]));
        button11.setFont(font);

        button12.setText(String.valueOf(gameArray[1][2]));
        button12.setFont(font);

        button13.setText(String.valueOf(gameArray[1][3]));
        button13.setFont(font);

        button20.setText(String.valueOf(gameArray[2][0]));
        button20.setFont(font);

        button21.setText(String.valueOf(gameArray[2][1]));
        button21.setFont(font);

        button22.setText(String.valueOf(gameArray[2][2]));
        button22.setFont(font);

        button23.setText(String.valueOf(gameArray[2][3]));
        button23.setFont(font);

        button30.setText(String.valueOf(gameArray[3][0]));
        button30.setFont(font);

        button31.setText(String.valueOf(gameArray[3][1]));
        button31.setFont(font);

        button32.setText(String.valueOf(gameArray[3][2]));
        button32.setFont(font);

        button33.setText(String.valueOf(gameArray[3][3]));
        button33.setFont(font);


        // Lista för att enkelt byta färg på knappar
        ArrayList<JButton> buttonArrayList = new ArrayList<>();
        buttonArrayList.add(button00);
        buttonArrayList.add(button01);
        buttonArrayList.add(button02);
        buttonArrayList.add(button03);
        buttonArrayList.add(button10);
        buttonArrayList.add(button11);
        buttonArrayList.add(button12);
        buttonArrayList.add(button13);
        buttonArrayList.add(button20);
        buttonArrayList.add(button21);
        buttonArrayList.add(button22);
        buttonArrayList.add(button23);
        buttonArrayList.add(button30);
        buttonArrayList.add(button31);
        buttonArrayList.add(button32);
        buttonArrayList.add(button33);

        for (JButton button : buttonArrayList) {
            if (button.getText().equals("0")) {
                button.setBackground(null);
                button.setForeground(button.getBackground());
                button.setText("");
            } else {
                button.setBackground(Color.cyan);
                button.setForeground(null);
            }
        }
        if (gameMethods.CheckIfWon(gameArray)) {
            gameComplete.setText("Grattis! Du klarade av pusslet!");
        }
        else gameComplete.setText("");
    }
}

