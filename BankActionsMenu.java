package bankapplication.midterm1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankActionsMenu extends Container {
    private JButton cashWithdrawalButton;
    private JButton balanceButton;
    private JButton changePinCodeButton;
    private JButton cashInAccountButton;
    private JButton accountDataButton;
    private JButton exitButton;

    public BankActionsMenu() {
        setSize(400, 500);
        setLayout(null);

        cashWithdrawalButton = new JButton("CASH WITHDRAWAL");
        cashWithdrawalButton.setBounds(90, 60, 300, 30);
        cashWithdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.cashWithrawalMenuWindow.setVisible(true);
                MainFrame.bankActionsMenuWindow.setVisible(false);
            }
        });
        add(cashWithdrawalButton);

        balanceButton = new JButton("VIEW BALANCE");
        balanceButton.setBounds(90, 100, 300, 30);
        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.viewBalanceMenuWindow.setVisible(true);
                MainFrame.bankActionsMenuWindow.setVisible(false);
            }
        });
        add(balanceButton);

        changePinCodeButton = new JButton("CHANGE PIN CODE");
        changePinCodeButton.setBounds(90, 140, 300, 30);
        changePinCodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.changePinCodeWindow.setVisible(true);
                MainFrame.bankActionsMenuWindow.setVisible(false);
            }
        });
        add(changePinCodeButton);

        cashInAccountButton = new JButton("CASH IN ACCOUNT");
        cashInAccountButton.setBounds(90, 180, 300, 30);
        cashInAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.cashInAccountMenuWindow.setVisible(true);
                MainFrame.bankActionsMenuWindow.setVisible(false);
            }
        });
        add(cashInAccountButton);

        accountDataButton = new JButton("VIEW ACCOUNT DATA");
        accountDataButton.setBounds(90, 220, 300, 30);
        accountDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.viewAccountMenuWindow.setVisible(true);
                MainFrame.bankActionsMenuWindow.setVisible(false);
            }
        });
        add(accountDataButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(90, 260, 300, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
