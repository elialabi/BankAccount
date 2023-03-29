package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount("Elizabeth",  "Alabi",
                "1st January 2000", 1023556,100.00);


//        Values
        System.out.println(bankAccount.fullNameAccount());

        bankAccount.deposit(500.0);
        System.out.println("Updated balance:" + bankAccount.balance);
        bankAccount.withdrawl(25.0);
        System.out.println("Updated balance:" + bankAccount.balance);









    }
}