import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 2678;

    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ATM pin : ");
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN)
        {
            menu();
        }
        else {
            System.out.println("Enter the correct pin");
        }
    }

    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();
                break;
        
            case 2:
                WithdrawMoney();
                break;
                
            case 3:
                DepositMOney();
                break;

            case 4:
            return;
               // Exit;
               // break;

            default:
            System.out.println("Enter the correct Choice");
                break;
        }
    }

    public void checkBalance(){
        System.out.println("Balance : "+Balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successful");
        }
        menu();
    }

    public void DepositMOney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount : ");
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposit Successful");
        menu();
    }
}

public class project3 {
    public static void main(String[] args) {
       ATM obj = new ATM();
       obj.checkpin(); 
    }
}
