package user;

import java.util.Scanner;

public class PinChange {

    public int P(int oldPin){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter New PIN: ");
        int pnew = sc.nextInt();

        System.out.println("PIN successfully changed");

        return pnew;

    }

}