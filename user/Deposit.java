package user;

import admin.Admin;
import admin.Logs;
import java.util.Scanner;

public class Deposit {

    public int D(int b,String user){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int a = sc.nextInt();
        if(a % 100 == 0){
            b += a;
            Logs.addLog("User Deposited: "+a);
            TransactionLogger.logTransaction(user,"Deposit",a,Admin.atmBalance);
        }
        else{
            System.out.println("Deposit amount must be multiple of 100");
        }
        return b;
    }

}