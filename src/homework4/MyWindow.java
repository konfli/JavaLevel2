package homework4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    JTextArea textArea;
    JTextField textMassage;

    public MyWindow() {
        setTitle("Окно чата");
        setBounds(400, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new BorderLayout());

        JPanel bottonPanel = new JPanel();
        add(bottonPanel, BorderLayout.SOUTH);
        bottonPanel.setLayout(new BorderLayout());

        JButton startButton = new JButton("Отправить сообщение");
        bottonPanel.add(startButton, BorderLayout.EAST);

        textArea = new JTextArea();
        JScrollPane textAreaScroll = new JScrollPane(textArea);
        centerPanel.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false);

        textMassage = new JTextField();
        bottonPanel.add(textMassage, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        textMassage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });


    }
    public void addText() {
        textArea.append(textMassage.getText()+"\n");
        textMassage.setText("");
    }
}