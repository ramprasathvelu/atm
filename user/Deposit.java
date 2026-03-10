package user;

import java.util.Scanner;

public class Deposit {

    public int D(int b){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        int a = sc.nextInt();

        if(a % 100 == 0){
            b += a;
        }
        else{
            System.out.println("Deposit amount must be multiple of 100");
        }

        return b;
    }

}