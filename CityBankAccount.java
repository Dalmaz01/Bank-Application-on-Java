package bankapplication.midterm1;

import java.io.Serializable;

public class CityBankAccount implements BankAccount, Serializable {
    private Long id;
    private String name;
    private String surname;
    private int balance;
    private int accountNumber;
    private int pinCode;

    public CityBankAccount(Long id, String name, String surname, int accountNumber, int pinCode, int balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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
        this.pinCode = pinCode;
        System.out.println("Ваш пин код был успешно изменен!");
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance -= credit;
        System.out.println("Вы успешно сняли денег на сумму: " + credit);
        System.out.println("На вашем счету осталось : " + balance);
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
        System.out.println("Вы успешно добавили денег на сумму: " + debet);
        System.out.println("На вашем счету : " + balance);
    }

    @Override
    public String accountData() {
        return name + " " + surname + " " + balance + " " + accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + pinCode + " " + accountNumber + " " + balance;
    }
}
