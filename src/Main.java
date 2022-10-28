import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    Main () {

        GUI gui = new GUI();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }



    public static void main(String[] args) {

        Main main = new Main();

    }
}


