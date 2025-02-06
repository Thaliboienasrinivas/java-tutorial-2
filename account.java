public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private NumberFormat indianCurrencyFormat;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        indianCurrencyFormat.setCurrency(Currency.getInstance("INR"));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + indianCurrencyFormat.format(amount) + ". New balance: " + indianCurrencyFormat.format(balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + indianCurrencyFormat.format(amount) + ". New balance: " + indianCurrencyFormat.format(balance));
            } else {
                System.out.println("Insufficient funds. Current balance: " + indianCurrencyFormat.format(balance));
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + indianCurrencyFormat.format(balance));
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1234567890", "John Doe", 1000.0);
        myAccount.displayAccountInfo();
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(2000.0);
        myAccount.withdraw(-100);
        myAccount.deposit(-100);
        myAccount.displayAccountInfo();
    }
}
