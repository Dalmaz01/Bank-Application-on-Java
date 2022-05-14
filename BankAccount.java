package bankapplication.midterm1;

public interface BankAccount {
    int getAccountNumber();
    int getPinCode();
    void setPinCode(String pinCode);

    void setPinCode(int pinCode);

    int totalBalance();
    void creditBalance(int credit);
    void debetBalance(int debet);
    String accountData();
}
