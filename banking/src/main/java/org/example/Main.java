package org.example;
class SavingsAccnt extends BankAccount implements Transaction{
    SavingsAccnt(String accountNum,double balance)
    {
        super(accountNum,balance);
    }
    //implement abstract methods
    void showBalance()
    {
        System.out.println("Account:"+accountNum+"  Balance:"+balance);
    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println("Deposited:"+amount);
    }
    public void withdraw(double amount){
        if (amount<=balance){
          balance-=amount;
          System.out.println("Withdrawn:"+amount);}
        else{
            System.out.println("Insufficient");}
    }
 }
