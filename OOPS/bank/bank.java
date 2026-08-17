import java.util.*;



class Account{
    public String name;
    protected int accountNumber;
    private String accountType;
    private double balance;

    //getter and setter methods for private variables
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
public class bank {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="John Doe";
        a1.accountNumber=123456; // This line will cause a compilation error because accountNumber is protected and cannot be accessed from outside the package.
        a1.setAccountType("Savings");
        System.out.println(a1.name);
        System.out.println(a1.getAccountType());
    }
}
