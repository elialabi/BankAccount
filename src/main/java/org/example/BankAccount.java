package org.example;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;

//Construction
    public BankAccount(String inputFirstName, String inputLastname,
                       String inputDob, int inputAccountnumber, int inputBalance){

        this.firstName = inputFirstName;
        this.lastName = inputLastname;
        this.accountNumber = inputAccountnumber;
        this.balance = inputBalance;



    }
//Getter and Setter
    public String getFirstName() {
        return firstName;
    }
    public String getLastname() {
            return lastName;
        }
    public int getAccount() {
        return accountNumber;

    public double getBalance() {
        return balance;

        }

    }























    }


    }
