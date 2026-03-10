import admin.Admin;
import java.util.*;
import user.User;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Admin a = new Admin();
        User u = new User();
        while(true){
            System.out.println("___________ATM___________");
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Exit");
            System.out.print("Enter NUmber: ");
            int op = sc.nextInt();
            if(op==1){
                a.A();
            }
            else if(op==2){
                u.U();
            }
            else if(op==3){
                System.out.println("Thank you for using ATM");
                break;
            }
            else{
                System.out.println("Invalid Option");
            }
        }
    }
}
