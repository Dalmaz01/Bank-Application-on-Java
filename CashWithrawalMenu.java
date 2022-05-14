package bankapplication.midterm1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashWithrawalMenu extends Container {
    private JLabel cashWithrawalLabel;

    private JTextField cashWithrawalText;

    private JButton cashButton;
    private JButton backButton;

    public CashWithrawalMenu() {
        setSize(400, 500);
        setLayout(null);

        cashWithrawalLabel = new JLabel("Введите сумму которую хотите снять:");
        cashWithrawalLabel.setBounds(90, 60, 300, 30);
        add(cashWithrawalLabel);

        cashWithrawalText = new JTextField();
        cashWithrawalText.setBounds(90, 100, 300, 30);
        add(cashWithrawalText);

        cashButton = new JButton("Cash");
        cashButton.setBounds(90, 140, 150, 30);
        cashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CityBankATM.cashWithrawal(cashWithrawalText.getText(), LoginMenu.acc_number_now);

                cashWithrawalText.setText("");

            }
        });
        add(cashButton);

        backButton = new JButton("Back");
        backButton.setBounds(240, 140, 150, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.bankActionsMenuWindow.setVisible(true);
                MainFrame.cashWithrawalMenuWindow.setVisible(false);
            }
        });
        add(backButton);

    }
}
