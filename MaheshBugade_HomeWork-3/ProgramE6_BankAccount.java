class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
}

public class ProgramE6_BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "Rahul";
        account.accountNumber = "123456";
        account.balance = 5000;
        System.out.println(account.accountHolder);
    }
}