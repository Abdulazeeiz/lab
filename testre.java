
public class testre {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(2000);
        account.withdraw(500);
        account.withdraw(400);
        System.out.println(account.getBalance());
        System.out.println("THE expected result is:: (100)");
    }
}
