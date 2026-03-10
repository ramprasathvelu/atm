package user;
import java.util.*;
public class UserLogin {
    public String UL(String name, int pass){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String s = sc.next();
        System.out.println("Enter Password: ");
        int p = sc.nextInt();
        if(UserDB.users.containsKey(s) && UserDB.users.get(s)==p){
            System.out.println("Login Successful");
            return s;
        }
        else{
            System.out.println("Invalid User");
            return null;
        }
    }
}
