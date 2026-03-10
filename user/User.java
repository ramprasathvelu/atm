package user;

import java.util.Scanner;

public class User {

    public void U(){

        Scanner sc = new Scanner(System.in);

        int pin = 7777;
        int balance = 1000;

        CheckBalance c = new CheckBalance();
        Deposit d = new Deposit();
        Withdraw w = new Withdraw();
        PinChange p1 = new PinChange();

        while(true){

            System.out.println("\n---- User Mode ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Pin Change");
            System.out.println("5. Exit");

            System.out.print("Enter option: ");
            int op = sc.nextInt();

            if(op == 1){

                System.out.print("Enter PIN: ");
                int p = sc.nextInt();

                if(p == pin){
                    c.C(balance);
                }
                else{
                    System.out.println("Invalid PIN");
                }

            }

            else if(op == 2){

                System.out.print("Enter PIN: ");
                int p = sc.nextInt();

                if(p == pin){
                    balance = d.D(balance);
                    System.out.println("Updated Balance: " + balance);
                }
                else{
                    System.out.println("Invalid PIN");
                }

            }

            else if(op == 3){

                System.out.print("Enter PIN: ");
                int p = sc.nextInt();

                if(p == pin){
                    balance = w.W(balance);
                    System.out.println("Updated Balance: " + balance);
                }
                else{
                    System.out.println("Invalid PIN");
                }

            }

            else if(op == 4){

                System.out.print("Enter Old PIN: ");
                int p = sc.nextInt();

                if(p == pin){
                    pin = p1.P(pin);
                }
                else{
                    System.out.println("Invalid PIN");
                }

            }

            else if(op == 5){

                System.out.println("Thank you for using ATM");
                break;

            }

            else{
                System.out.println("Invalid Option");
            }

        }

    }

}