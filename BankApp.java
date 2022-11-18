import java.util.Scanner;

// creating variables to store name,account number and balance;
public class BankApp {
    private String Name;
    private String AccountNo;
    private int Balance;

    Scanner sc = new Scanner(System.in);

    // creating getter and setter methods to access variables
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
