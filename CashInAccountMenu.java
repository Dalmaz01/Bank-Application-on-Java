package bankapplication.midterm1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashInAccountMenu extends Container {
    private JLabel cashLabel;

    private JTextField cashText;

    private JButton cashButton;
    private JButton backButton;

    public CashInAccountMenu() {
        setSize(400, 500);
        setLayout(null);

        cashLabel = new JLabel("Введите сумму которую хотите добавить");
        cashLabel.setBounds(90, 60, 300, 30);
        add(cashLabel);

        cashText = new JTextField();
        cashText.setBounds(90, 100, 300, 30);
        add(cashText);

        cashButton = new JButton("Cash");
        cashButton.setBounds(90, 140, 150, 30);
        cashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CityBankATM.cashInAccount(cashText.getText(), LoginMenu.acc_number_now);

                cashText.setText("");

            }
        });
        add(cashButton);

        backButton = new JButton("Back");
        backButton.setBounds(240, 140, 150, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.bankActionsMenuWindow.setVisible(true);
                MainFrame.cashInAccountMenuWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}
