package user;
import db.TransactionLogger;
import admin.Admin;
import admin.Logs;
public class CheckBalance {
    public void C(int b,String user){
        System.out.println("Bank Balance: " + b);
        Logs.addLog("User checked balance");
        TransactionLogger.logTransaction(user,"Check Balance",b,Admin.atmBalance);

    }

}