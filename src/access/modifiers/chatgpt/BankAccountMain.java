package access.modifiers.chatgpt;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccountNumber(00000000001);
        b1.setAccountHolderName("Jane Smith");
        b1.setBalance(576.00);
        System.out.println("b1 : account number - "+b1.getAccountNumber()+", account Holder Name - "+b1.getAccountHolderName()+", balance - "+b1.getBalance());
        b1.deposit(43);
        System.out.println("New balance - "+b1.getBalance());

        System.out.println("New balance - "+b1.withdraw(400));
        b1.withdraw(400);
        System.out.println("New balance - "+b1.withdraw(400));
        System.out.println("b1 Final balance - "+b1.getBalance());


        BankAccount b2 = new BankAccount();
        b2.setAccountNumber(00000000002);
        b2.setAccountHolderName("Michael Johnson");
        b2.setBalance(1000.00);
        boolean isTransferSuccessful = b1.transfer(b2,100);

        System.out.println("Transfer "+ (isTransferSuccessful ?"Successful":"Unsuccessful")+" :  New balances - ");
        System.out.println("b1 balance : "+b1.getBalance() +", b2 balance : "+b2.getBalance());

        isTransferSuccessful = b1.transfer(b2,300);

        System.out.println("Transfer "+ (isTransferSuccessful ?"Successful":"Unsuccessful")+" :  New balances - ");
        System.out.println("b1 balance : "+b1.getBalance() +", b2 balance : "+b2.getBalance());

    }
}
