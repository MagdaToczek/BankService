import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {

        HashMap<String, String> testUsers = new HashMap<String, String>() {{
            put("000001", "0000");
            put("000002","123@abc");
            put("000008", "0001");
            put("000001", "0001");
        }};

        BankActivities bs = new BankActivities();
        Sender sender = new Sender("1234567890", "Jan", "Kowalski");
        Recipient recipient = new Recipient("ul. Lipowa 2, Gdynia", "0123456789", "Maria", "Nowak");

        for(Map.Entry<String, String> testUsersEntry : testUsers.entrySet()) {
            String username = testUsersEntry.getKey();
            String password = testUsersEntry.getValue();
            System.out.println("\nUser: " + username);
            bs.login(username, password);
            bs.transfer(username, sender, recipient);
            bs.logout(username);
        }
    }
}
