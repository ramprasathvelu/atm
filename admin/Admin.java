package admin;
import db.TransactionLogger;
import java.util.*;
public class Admin {
    String adminID = "ramprasath";
    int password = 2829;
    public static int atmBalance = 10000;
    // public int atmBal(){
    //     return this.atmBalance;
    // }
    public void A(){
        Scanner sc = new Scanner(System.in);

        Balance b = new Balance();
        Load l = new Load();

        System.out.print("Enter Admin ID: ");
        String id = sc.next();

        System.out.print("Enter Password: ");
        int pass = sc.nextInt();

        if(this.adminID.equals(id) && this.password==pass){
            while(true){
                System.out.println("\n---- Admin Mode ----");
                System.out.println("1. Check Balance");
                System.out.println("2. Load Cash");
                System.out.println("3. View Transactions");
                System.out.println("4. Exit");
                System.out.print("Enter option: ");
                int op = sc.nextInt();
                if(op==1){
                    b.B(this.atmBalance);
                }
                else if(op==2){
                    this.atmBalance += l.L();
                }
                else if(op==3){
                    Logs.showLogs();
                    TransactionLogger.showMongoDB();
                }
                else if(op==4){
                    System.out.println("Exited From Admin");
                    break;
                }
                else{
                    System.out.println("Invalid Option");
                }
            }
        }
        else{
            System.out.println("Invalid Admin Credentials");
        }
    }
}
