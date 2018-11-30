import javax.swing.JFrame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TBView extends JFrame {
    public TBView() {
        setBounds(200,200,1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Thunderbird {
    public static void main(String[] args) throws IOException {
        System.out.println("Thunderbird starting...");

        if (args.length != 1) {
            System.out.println("Error: This application requires the name of a file to be passed in.");
            System.exit(0);
        }

        BufferedReader myBR = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = myBR.readLine()) != null) {
            String[] elements = line.split("\"");
            if (elements.length > 1) {
                System.out.println(elements[1]);
            }
        }

        // TBView myView = new TBView();
    }
}