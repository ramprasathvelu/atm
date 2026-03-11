package user;
import admin.*;
import java.util.Scanner;
public class Withdraw {
    public int W(int b,String user){
        Admin ad = new Admin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int a = sc.nextInt();
        if (Admin.atmBalance>=a) {
            if(a % 100 == 0 && a <= b){
                b -= a;
                Admin.atmBalance-=a;
                Logs.addLog("User withdrew: " + amount);
                TransactionLogger.logTransaction(user,"Withdraw",a,Admin.atmBalance);
            }
            else{
                System.out.println("Invalid amount or insufficient balance");
                Logs.addLog("Failed withdrawal attempt: " + a);
            }
        }
        else{
            System.out.println("Sorry! Limited Amount in ATM or Empty");
            System.out.println("TRY AGAIN LATER");
            Logs.addLog("Failed withdrawal attempt: " + a);
        }
        return b;
    }

}