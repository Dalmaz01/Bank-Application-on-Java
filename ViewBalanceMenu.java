package bankapplication.midterm1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewBalanceMenu extends Container {
    private JLabel balanceLabel;

    public static JTextArea balanceText;

    private JButton balanceButton;
    private JButton backButton;

    public ViewBalanceMenu() {



        setSize(400, 500);
        setLayout(null);

        balanceLabel = new JLabel("Ваш баланс составляет:");
        balanceLabel.setBounds(90, 60, 300, 30);
        add(balanceLabel);

        balanceText = new JTextArea();
        balanceText.setBounds(90, 100, 300, 30);
        add(balanceText);

        balanceButton = new JButton("View Balance");
        balanceButton.setBounds(90, 140, 150, 30);
        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                for (int i = 0; i < CityBankATM.getAccounts().size(); i++) {
                    int account_number = Integer.parseInt(CityBankATM.getAccounts().get(i).toString().split(" ")[4]);
                    if(account_number == Integer.parseInt(LoginMenu.acc_number_now)) {
                        int balance = Integer.parseInt(CityBankATM.getAccounts().get(i).toString().split(" ")[5]);

                        balanceText.setText(String.valueOf(balance));
                    }
                }


            }
        });
        add(balanceButton);

        backButton = new JButton("Back");
        backButton.setBounds(240, 140, 150, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.bankActionsMenuWindow.setVisible(true);
                MainFrame.viewBalanceMenuWindow.setVisible(false);
            }
        });
        add(backButton);

    }
}
