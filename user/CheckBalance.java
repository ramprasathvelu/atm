package user;
import admin.Logs;
public class CheckBalance {
    public void C(int b){
        System.out.println("Bank Balance: " + b);
        Logs.addLog("User checked balance");
    }

}