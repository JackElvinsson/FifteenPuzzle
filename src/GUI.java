import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {


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

        button0.addActionListener();
        button1.addActionListener();
        button2.addActionListener();
        button3.addActionListener();
        button4.addActionListener();
        button5.addActionListener();
        button6.addActionListener();
        button7.addActionListener();
        button8.addActionListener();
        button9.addActionListener();
        button10.addActionListener();
        button11.addActionListener();
        button12.addActionListener();
        button13.addActionListener();
        button14.addActionListener();
        button15.addActionListener();

        newGame.addActionListener();


        pack();
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}

