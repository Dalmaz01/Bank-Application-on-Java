package bankapplication.midterm1;



import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CityBankATM {
    public static MainFrame frame;

    private static Connection connection;
    private static String url = "jdbc:mysql://localhost/bank_management?serverTimezone=Europe/Moscow&useSSL=false";
    private static String user = "root";
    private static String pass = "";



    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("connection");
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void cashWithrawal(String balance, String acc_number) {
        try {
            String query = "update bank_accounts set balance=balance-? where account_number=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, balance);
            preparedStatement.setString(2, acc_number);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "The "+balance+" was cash withrawed from yours!");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isLogin(String acc_number, String pin_code) {
        try {
            String query = "select * from bank_accounts where account_number=? and pin_code=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, acc_number);

            preparedStatement.setString(2, pin_code);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                resultSet.close();

                preparedStatement.close();


                MainFrame.mainMenuWindow.setVisible(true);
                MainFrame.loginMenuWindow.setVisible(false);
                return true;


            }else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public static String getBalance(String acc_number) {
        String balance = "";
        try {



            String query = "select balance from bank_accounts where account_number=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, acc_number);
            ResultSet resultSet = preparedStatement.executeQuery(query);

            while (resultSet.next()) {

                balance = resultSet.getString("balance");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return balance;
    }

    public static ArrayList<CityBankAccount> getAccounts(){
        ArrayList<CityBankAccount> cityBankAccounts = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            String query = "select * from bank_accounts";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int accout_number = resultSet.getInt("account_number");
                int pin_code = resultSet.getInt("pin_code");
                int balance = resultSet.getInt("balance");

                cityBankAccounts.add(new CityBankAccount(id, name, surname, accout_number, pin_code, balance));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return cityBankAccounts;
    }

    public static void changePinCode(String acc_number, String newPinCode) {
        try {
            String query = "update bank_accounts set pin_code=? where account_number=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newPinCode);
            preparedStatement.setString(2, acc_number);



            preparedStatement.executeUpdate();


        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static int getPinCode(String acc_number) {
        int pinCode = 0;
        try {
            String query = "select * from bank_accounts where account_number=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, acc_number);



            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                pinCode = resultSet.getInt("pin_code");
                resultSet.close();

                preparedStatement.close();



            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pinCode;
    }

    public static void cashInAccount(String balance, String acc_number) {
        try {
            String query = "update bank_accounts set balance=balance+? where account_number=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, balance);
            preparedStatement.setString(2, acc_number);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "The "+balance+" was cashed to yours!");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }





    private static void commisiya(int index) {
        Database.allAccounts[index].creditBalance(200);
        System.out.println("С вас задержана коммисия в сумме: " + 200 + " тенге");
    }

}

