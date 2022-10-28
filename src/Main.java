import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    Main () {

        GUI gui = new GUI();

    }

    public static void main(String[] args) {
        GameMethods gm = new GameMethods();
        gm.testGame();

        Main main = new Main();

    }
}


