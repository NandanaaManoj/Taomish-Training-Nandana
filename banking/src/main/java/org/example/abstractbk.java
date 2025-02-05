package org.example;
abstract class BankAccount
{
    String accountNum;
    double balance;
    abstract void showBalance();
    BankAccount(String accountNum,double balance){ //constructor
        this.accountNum=accountNum;
        this.balance=balance;
    }
}