package bankapplication.midterm1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePinCode extends Container {
    private JLabel oldPinCodeLabel;
    private JLabel newPinCodeLabel;

    private JTextField oldPinCodeText;
    private JTextField newPinCodeText;

    private JButton changeButton;
    private JButton backButton;

    public ChangePinCode() {
        setSize(400, 500);
        setLayout(null);

        oldPinCodeLabel = new JLabel("Введите старый пин код");
        oldPinCodeLabel.setBounds(90, 60, 300, 30);
        add(oldPinCodeLabel);

        oldPinCodeText = new JTextField();
        oldPinCodeText.setBounds(90, 100, 300, 30);
        add(oldPinCodeText);

        newPinCodeLabel = new JLabel("Введите новый пин код");
        newPinCodeLabel.setBounds(90, 140, 300, 30);
        add(newPinCodeLabel);

        newPinCodeText = new JTextField();
        newPinCodeText.setBounds(90, 180, 300, 30);
        add(newPinCodeText);

        changeButton = new JButton("Change");
        changeButton.setBounds(90, 220, 150, 30);
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int old = Integer.parseInt(oldPinCodeText.getText());
                if(Integer.parseInt(oldPinCodeText.getText()) == CityBankATM.getPinCode(LoginMenu.acc_number_now)){
                    CityBankATM.changePinCode(LoginMenu.acc_number_now, newPinCodeText.getText());
                    JOptionPane.showMessageDialog(null, "Pin Code is changed!!!");
                }else {
                    JOptionPane.showMessageDialog(null, "Incorrect old Pin Code");
                }
                oldPinCodeText.setText("");
                newPinCodeText.setText("");


            }
        });
        add(changeButton);

        backButton = new JButton("Back");
        backButton.setBounds(240, 220, 150, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.bankActionsMenuWindow.setVisible(true);
                MainFrame.changePinCodeWindow.setVisible(false);
            }
        });
        add(backButton);
    }
}
