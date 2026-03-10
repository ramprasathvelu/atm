package user;
import java.util.*;
public class UserDB {
    public void UDB(){
        static HashMap<String, Integer> users = new HashMap<>();

        static {
            users.put("ram", 7777);
            users.put("prasath", 3333);
        }
    }
}
