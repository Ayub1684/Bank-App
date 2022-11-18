import java.util.Scanner;

// calling class to call methods
public class Calling {

    Scanner sc = new Scanner(System.in);

    FillDetails fd = new FillDetails();

    public void calling(){
        System.out.println("---------/*Welcome to ATM*/------");
        System.out.println("To create account enter details");
        fd.createAccount();
        System.out.println();

        int i = 1;
        do {

            System.out.println();
            System.out.println("To view Details Enter 1");
            System.out.println("To Deposit Enter 2");
            System.out.println("To Withdraw enter 3");
            System.out.println("To Exit Enter 5");
            System.out.print("Enter choise :");



            String choise = sc.next();

                System.out.println();

                switch (choise){
                    case "1":
                        fd.details();
                        break;
                    case "2":
                        fd.deposit();
                        break;
                    case "3":
                        fd.withdrawal();
                        break;
                    case "5":
                        return;
                    default:
                        System.out.println("Wrong input");


                }

        }while (i < 5);

    }
}
