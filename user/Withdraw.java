package user;

import java.util.Scanner;
public class Withdraw {
    public int W(int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int a = sc.nextInt();
        if(a % 100 == 0 && a <= b){
            b -= a;
        }
        else{
            System.out.println("Invalid amount or insufficient balance");
        }
        return b;
    }

}