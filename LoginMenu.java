package bankapplication.midterm1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginMenu extends Container {

    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/bank_management?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String pass = "";

    private JLabel accNumberLabel;
    private JLabel pinLabel;

    private JTextField accNumberText;
    private JTextField pinText;

    private JButton loginButton;
    private JButton forgotButton;
    private JButton exitButton;

    public static String acc_number_now;

    public LoginMenu() {

        setSize(500, 400);
        setLayout(null);

        accNumberLabel = new JLabel("Account Number");
        accNumberLabel.setBounds(60, 120, 110, 30);
        add(accNumberLabel);

        accNumberText = new JTextField();
        accNumberText.setBounds(175, 120, 120, 30);
        add(accNumberText);

        pinLabel = new JLabel("Pin Code");
        pinLabel.setBounds(60, 160, 110, 30);
        add(pinLabel);

        pinText = new JTextField();
        pinText.setBounds(175, 160, 120, 30);
        add(pinText);

        loginButton = new JButton("Login");
        loginButton.setBounds(90, 200, 80, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(CityBankATM.isLogin(accNumberText.getText(), pinText.getText())) {
                    MainFrame.bankActionsMenuWindow.setVisible(true);
                    MainFrame.mainMenuWindow.setVisible(false);
                    acc_number_now = accNumberText.getText();
                }else {
                    JOptionPane.showMessageDialog(null, "Incorrect login and password!");
                }
//                try {
//                    String query = "select * from bank_accounts where account_number=? and pin_code=?";
//
//                    PreparedStatement preparedStatement = connection.prepareStatement(query);
//                    preparedStatement.setString(1, accNumberText.getText());
//
//                    preparedStatement.setString(2, pinText.getText());
//
//                    ResultSet resultSet = preparedStatement.executeQuery();
//                    if(resultSet.next()) {
//                        resultSet.close();
//
//                        preparedStatement.close();
//
//
//                        MainFrame.mainMenuWindow.setVisible(true);
//                        MainFrame.loginMenuWindow.setVisible(false);
//
//
//                    }else {
//                        JOptionPane.showMessageDialog(null, "Incorrect login and password!");
//                    }
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
            }
        });
        add(loginButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(190, 200, 80, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
        });
        add(exitButton);
    }
}