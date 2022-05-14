package bankapplication.midterm1;

public class NationalBankAccount implements BankAccount {
    private String fullName;
    private int balance;
    private int accountNumber;
    private int pinCode;

    public NationalBankAccount(String fullName, int balance, int accountNumber, int pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {

    }



    @Override
    public void setPinCode(int pinCode) {

    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance -= credit;
        System.out.println("Вы успешно сняли денег на сумму: " + credit);
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
        System.out.println("Вы успешно добавили денег на сумму: " + debet);
        System.out.println("На вашем счету : " + balance);
    }

    @Override
    public String accountData() {
        return fullName + " " + accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
