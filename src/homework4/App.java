package homework4;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
    runApp();
    }

    public static void runApp() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });
    }
}