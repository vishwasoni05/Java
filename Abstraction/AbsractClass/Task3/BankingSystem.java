// Scenario 3: Banking System
// Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.

abstract class Account {
    String account_holder_name;

    Account(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }
    abstract void withdraw();

    abstract void deposit();

    void display() {
        System.out.println("\nAcount Holder Name:" + account_holder_name);
    }
}

class SavingAccount extends Account {
    SavingAccount(String account_holder_name) {
        super(account_holder_name);
    }

    @Override
    void withdraw() {
        System.out.println("10000 withdraw from SavingAccounts!!");
    }

    @Override
    void deposit() {
        System.out.println("200000 deposit in SavingAccounts!!");
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String account_holder_name) {
        super(account_holder_name);
    }

    @Override
    void withdraw() {
        System.out.println("50000 withdraw from CurrentAccounts!!");
    }

    @Override
    void deposit() {
        System.out.println("300000 deposit in CurrentAccounts!!");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount("Mohak");
        s.display();
        s.withdraw();
        s.deposit();

        CurrentAccount c = new CurrentAccount("Vishwa");
        c.display();
        c.withdraw();
        c.deposit();
    }
}
