package bankapplication.midterm1;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenuWindow;
    public static LoginMenu loginMenuWindow;
    public static CashWithrawalMenu cashWithrawalMenuWindow;
    public static ViewBalanceMenu viewBalanceMenuWindow;
    public static ChangePinCode changePinCodeWindow;
    public static CashInAccountMenu cashInAccountMenuWindow;
    public static ViewAccountMenu viewAccountMenuWindow;
    public static BankActionsMenu bankActionsMenuWindow;

    public MainFrame() {
        setSize(500, 400);
        setTitle("BankATM application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainMenuWindow = new MainMenu();
        setLocation(0, 0);
        add(mainMenuWindow);

        loginMenuWindow = new LoginMenu();
        setLocation(0, 0);
        loginMenuWindow.setVisible(false);
        add(loginMenuWindow);

        cashWithrawalMenuWindow = new CashWithrawalMenu();
        setLocation(0, 0);
        cashWithrawalMenuWindow.setVisible(false);
        add(cashWithrawalMenuWindow);

        viewBalanceMenuWindow = new ViewBalanceMenu();
        setLocation(0, 0);
        viewBalanceMenuWindow.setVisible(false);
        add(viewBalanceMenuWindow);

        changePinCodeWindow = new ChangePinCode();
        setLocation(0, 0);
        changePinCodeWindow.setVisible(false);
        add(changePinCodeWindow);

        cashInAccountMenuWindow = new CashInAccountMenu();
        setLocation(0, 0);
        cashInAccountMenuWindow.setVisible(false);
        add(cashInAccountMenuWindow);

        viewAccountMenuWindow = new ViewAccountMenu();
        setLocation(0, 0);
        viewAccountMenuWindow.setVisible(false);
        add(viewAccountMenuWindow);

        bankActionsMenuWindow = new BankActionsMenu();
        setLocation(0, 0);
        bankActionsMenuWindow.setVisible(false);
        add(bankActionsMenuWindow);
    }
}
