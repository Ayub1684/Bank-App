import java.util.Scanner;

// class to assign value to variables and display output
public class FillDetails {


    BankApp ba = new BankApp();
    Scanner sc = new Scanner(System.in);

    //    method to create account by taking user input;
    public void createAccount(){
        System.out.print("Enter you name :");
        ba.setName(sc.next());
        System.out.print("Enter Account Number :");
        ba.setAccountNo(sc.next());

        ba.setBalance(0);
    }

    //    method to display details
    public void details(){
        System.out.println("Name of Account Holder :"+ba.getName());
        System.out.println("Account no :"+ba.getAccountNo());
        System.out.println("Balance :"+ba.getBalance());
    }

    //    method to deposit amount
    public void deposit(){
        int amt;
        System.out.print("Enter the amount to deposit :");
        amt =  sc.nextInt();
//        Balance = Balance+amt;
        ba.setBalance(ba.getBalance()+amt);
        System.out.println("Your new Balance is "+ba.getBalance());

    }

    //    method to withdraw amount
    public void withdrawal(){
        int amt;
        System.out.print("Enter the amount you want to withdraw :");
        amt = sc.nextInt();
        if (ba.getBalance() >= amt){
//            Balance = Balance-amt;
            ba.setBalance(ba.getBalance()-amt);
            System.out.println("Balance after withdraw :"+ba.getBalance());
        }
        else {
            System.out.println("your account balance is less than :"+amt);
        }
    }
}
