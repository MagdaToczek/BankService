import java.lang.*;

public class Recipient extends Account{
    private String address;

    public Recipient(String address, String accountNo, String firstName, String lastName) {
        super(accountNo, firstName, lastName);
        this.address = address;
    }
}

