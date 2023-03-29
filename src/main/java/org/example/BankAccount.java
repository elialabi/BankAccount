package org.example;


public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    public double balance;

    public BankAccount(String firstName, String lastName, String dateOfBirth , int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;



    }
    public String fullNameAccount(){
        return "This is " + firstName + lastName ;

    }

     public void deposit(double amount) {
        balance += amount;

     }
     public void withdrawl(double amount) {
         balance -= amount;
//
//         public void payInterest(double interestRate){
//                    double interest = balance* rate;
//                     balance+= interest;
         }
    }


























