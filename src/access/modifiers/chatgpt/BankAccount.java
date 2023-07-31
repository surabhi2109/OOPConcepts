package access.modifiers.chatgpt;

//Write a class BankAccount with private data members accountNumber, accountHolderName, and balance. Provide public methods to deposit and withdraw money from the account. Ensure that the balance is never negative after a withdrawal.
//Write a class `Bank` that represents a bank account with private data members `accountNumber`, `accountHolderName`, and `balance`. Implement public methods to deposit and withdraw money from the account. Additionally, implement a method to transfer money from one account to another. Ensure that the transfer is successful only if the sender's account has sufficient balance.

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String withdraw(double amount){
        if(amount<=this.balance){
            this.balance = this.balance - amount;
            return String.valueOf(this.balance);
        } else {
            return "Insufficient balance";
        }
    }

    public double deposit(double amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public boolean transfer(BankAccount b, double amount){
        if(amount>this.balance)
            return false;
        else {
            this.balance = this.balance - amount;
            b.setBalance(b.getBalance() + amount);
            return true;
        }
    }

}
