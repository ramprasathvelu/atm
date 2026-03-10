package admin;
import java.util.*;
public class Logs {
    static ArrayList<String> log = new ArrayList<>();
    public static void addLog(String msg){
        log.add(msg);
    }
    public static void showLogs(){
        System.out.println("------ TRANSACTION LOGS ------");
        for(String l : log){
            System.out.println(l);
        }
    }
}
