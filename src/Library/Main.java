package Library;

import Admin.ConsolePrompt;
import IHM.GraphicApplication;


import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    //ConsolePrompt consolePrompt = new ConsolePrompt();
                    //consolePrompt.launchApplication();

                    // Start the demo
                    UIManager.setLookAndFeel( new NimbusLookAndFeel() );
                    GraphicApplication newInterface = new GraphicApplication();
                    newInterface.setVisible( true );


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
