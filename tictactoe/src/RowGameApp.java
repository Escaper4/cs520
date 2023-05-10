import controller.ComputerRowGameController;
import controller.RowGameController;

import java.util.*;
import static java.lang.System.*;

public class RowGameApp {
    /**
     * Starts a new game in the GUI.
     */
    public static void main(String[] args) {
        // choose step
        RowGameController game = null;
        Scanner scanner = new Scanner(System.in);
        out.println("Please choose against a human or a computer");
        String input = scanner.nextLine();
        // choose human
        if (input.equals("human")) {
            game = new RowGameController();
            // choose computer
        } else if (input.equals("computer")) {
            game = new ComputerRowGameController();
            // get Illegal input and return reason
        } else {
            out.println("Illegal input");
            System.exit(1);
        }

        game.gameView.gui.setVisible(true);

        scanner.close();
    }
}
