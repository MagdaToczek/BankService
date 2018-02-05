import java.util.*;
import java.lang.*;

public class BankActivities implements BankService{
    private String username;
    private String password;
    private boolean isRegistered = false;
    private boolean isLogged = false;
    private int loggedUserIndex;
    private int n;

    HashMap<String, String> users = new HashMap<String, String>() {{
        put("000001","0000");
        put("000002","123@abc");
        put("000003","11235");
        put("000004","0000");
        put("000005","4321");
        put("000006","1122");
        put("000007","9999");
    }};

    ArrayList<String> loggedUsers = new ArrayList<String>() {{
        add("000001");
        add("000004");
        add("000006");
    }};

    public void login(String username, String password) {
        for(Map.Entry<String, String> registeredUsersEntry : users.entrySet()) {
            if(registeredUsersEntry.getKey().equals(username) && registeredUsersEntry.getValue().equals(password)) {
                isRegistered = true;
            }
        }

        if(isRegistered == true) {
            System.out.println("Uzytkownik zarejestrowany");
        }else {
            System.out.println("Nie jesteś użytkownikiem naszego banku!");
        }
    }

    public void transfer(String username, Sender from, Recipient to) {
        isLogged = loggedUsers.contains(username);

        if(isLogged) {
            System.out.println("Transakcja wykonana poprawnie");
        }else {
            System.out.println("Użytkownik nie jest zalogowany");
        }
    }

    public void logout(String username) {
        for(n = 0; n < loggedUsers.size(); n++) {
            if(loggedUsers.get(n).equals(username)) {
                isLogged = true;
                loggedUserIndex = n;
            }
        }

        if(isLogged) {
            System.out.println("Uzytkownik poprawnie wylogowany");
            loggedUsers.remove(loggedUserIndex);
            isLogged = false;
        }else {
            System.out.println("Uzytkownik nie może się wylogować");
        }
    }
}

