import java.util.Scanner;
class ATM {
    float Balance;
    public void pin() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Pin : ");
        int pin = scan.nextInt();
        if(pin == 1234){
            System.out.println("Welcome!");
            System.out.println("");
            menu();
        }
        else {
            System.out.println("Invalid pin...");
            System.out.println("");
            pin();
        }
    }
    public void menu(){
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.println("Enter your Choice : ");
        Scanner sc =new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            balance();
        }
        else if(opt == 2){
            withdraw();
        }
        else if(opt == 3){
            deposit();
        }
        else if (opt ==4){
            return;
        }
        else {
            System.out.println("Enter a valid choice!");
            System.out.println("");
        }
    }
public void balance(){
    System.out.println("Your Balance is : "+ Balance);
    System.out.println("");
    menu();
}

public void withdraw(){
    System.out.println("Enter Amount :");
    Scanner sc =new Scanner(System.in);
    float amount = sc.nextFloat();
    if(Balance>amount){
        Balance = Balance-amount;
        System.out.println(amount +" Amount has withdraw");
        System.out.println("");
    }
    else{
        System.out.println("insufficient Amount");
        System.out.println("");
    }

    menu();
}

public void deposit(){
    System.out.println("Enter Amount :");
    Scanner sc =new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance= Balance+amount;
    System.out.println(amount +" Amount has Deposited");
    System.out.println("");
    menu();
}

}

public class Main {
    public static void main(String[] args) {

        ATM machine =new ATM();
        machine.pin();
    }
}