import java.util.Scanner;

public class ATM_MACHINE {
    public static void main(String[] args) {
        ATM o1 = new ATM();
        System.out.println(o1.PIN);
    }
}

class ATM {
    float balance = 100000;
    int PIN = 4312;
    Scanner sc = new Scanner(System.in);

    ATM(){
        checkpin();
    }

    public void checkpin() {
        System.out.println("Enter your pin : ");
        int pin = sc.nextInt();
        if (pin == PIN) {
            menu();
        } else {
            System.out.println("Your entered pin is in correct !");
            checkpin();
        }
    }

    public void menu() {
        System.out.println("Select the option \n 1: Deposite Cash \n 2: Withdraw Money \n 3: CheckBalance \n 4:Exit");
        int option = sc.nextInt();
        if (option == 1) {
            deposite();
        } else if (option == 2) {
            Withdraw();
        } else if (option == 3) {
            checkBalance();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Please Enter the correct option");
            menu();
        }
    }

    public void deposite() {
        System.out.println("Enter the amount to be deposite : ");
        int addAmount = sc.nextInt();
        balance += addAmount;
        checkBalance();
    }

    public void Withdraw() {
        System.out.println("Enter the amount to be withdrawn ! \n");
        int withdrawnAmount = sc.nextInt();
        if (balance < withdrawnAmount) {
            System.out.println("You have low balance amount can not be withdrawn :\n");
            menu();
        }
        balance -= withdrawnAmount;
        checkBalance();
    }

    public void checkBalance() {
        System.out.println("You remaining balance is " + balance + "\n");
        menu();
    }

}
