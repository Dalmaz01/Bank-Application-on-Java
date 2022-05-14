package bankapplication.midterm1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton loginButton;
    private JButton exitButton;

    public MainMenu() {
        setSize(500, 400);
        setLayout(null);

        loginButton = new JButton("Login");
        loginButton.setBounds(90, 60, 300, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.loginMenuWindow.setVisible(true);
                MainFrame.mainMenuWindow.setVisible(false);
            }
        });
        add(loginButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(90, 100, 300, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
