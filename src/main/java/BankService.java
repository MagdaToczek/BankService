import java.lang.*;

public interface BankService {
    void login(String username, String password); //Podczas wywołania tej metody powinno nastąpić sprawdzenie czy użytkownik jest zarejestrowany (można to symulować używając Mapy przechowującej znanych użytkowników)
    void logout(String username); //logout powoduje wylogowanie użytkownika - powinien wyświetlić się komunikat i sprawdzenie czy użytkownik faktycznie moze sie wylogować (np. jakaś koleckja z aktualnie zalogowanymi użytkownikami)
    void transfer(String username, Sender from, Recipient to); //Metoda transfer powinna zrealizować przelew - na tę chwilę wystarczy aby był to zwykły komunikat. Ważne jest jednak aby sprawdzić czy uzytkownik może wykonać przelew (zalogował się)
}
