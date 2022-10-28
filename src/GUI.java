import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {


    // Buttons
    JButton button0 = new JButton("*TOM RUTA*");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");
    JButton button11 = new JButton("11");
    JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");
    JButton button14 = new JButton("14");
    JButton button15 = new JButton("15");

    JButton newGame = new JButton("New game");

    // Panels
    JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
    JPanel topPanel = new JPanel(new GridLayout(1, 1));
    JPanel gameCompletePanel = new JPanel(new FlowLayout());

    // Labels
    JLabel gameComplete = new JLabel("");

    public GUI() {

        topPanel.add(newGame);

        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button10);
        buttonPanel.add(button11);
        buttonPanel.add(button12);
        buttonPanel.add(button13);
        buttonPanel.add(button14);
        buttonPanel.add(button15);

        gameCompletePanel.add(gameComplete);

        // GUI
        setLayout(new BorderLayout());
        add("North", topPanel);
        add("Center", buttonPanel);
        add("South", gameCompletePanel);

        button00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        pack();
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}

