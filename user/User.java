package user;

import java.util.Scanner;

public class User {
    public void U(){

        Scanner sc = new Scanner(System.in);
        int pin = 7777;
        int balance = 1000;
        int attempt = 0;
        CheckBalance c = new CheckBalance();
        Deposit d = new Deposit();
        Withdraw w = new Withdraw();
        PinChange p1 = new PinChange();

        UserLogin ul = new UserLogin();
        System.out.print("Enter User Name: ");
        String eUser = sc.next();
        System.out.print("Enter Password: ");
        int ePass = sc.nextInt();
        String user = ul.UL(eUser,ePass);
        if(user != null){
            while(true && attempt<3){
    
                System.out.println("\n---- "+user+" ----");
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
                        c.C(balance,user);
                    }
                    else{
                        attempt++;
                        System.out.println("Invalid PIN");
                        System.out.println("Attempt "+attempt+"/3");
                    }
    
                }
    
                else if(op == 2){
    
                    System.out.print("Enter PIN: ");
                    int p = sc.nextInt();
    
                    if(p == pin){
                        balance = d.D(balance,user);
                        System.out.println("Updated Balance: " + balance);
                    }
                    else{
                        attempt++;
                        System.out.println("Invalid PIN");
                        System.out.println("Attempt "+attempt+"/3");
                    }
    
                }
    
                else if(op == 3){
    
                    System.out.print("Enter PIN: ");
                    int p = sc.nextInt();
    
                    if(p == pin){
                        balance = w.W(balance,user);
                        System.out.println("Updated Balance: " + balance);
                    }
                    else{
                        attempt++;
                        System.out.println("Invalid PIN");
                        System.out.println("Attempt "+attempt+"/3");
                    }
    
                }
    
                else if(op == 4){
    
                    System.out.print("Enter Old PIN: ");
                    int p = sc.nextInt();
    
                    if(p == pin){
                        pin = p1.P(pin,user);
                    }
                    else{
                        attempt++;
                        System.out.println("Invalid PIN");
                        System.out.println("Attempt "+attempt+"/3");
                    }
    
                }
    
                else if(op == 5){
    
                    System.out.println("Thank you "+user+"for using ATM ");
                    break;
    
                }
    
                else{
                    System.out.println("Invalid Option");
                }
    
            }
        }
        else{
            System.out.println("Invalid User");
        }

    }

}