package org.example;
class Main{
    public static void main(String[] args){
        SavingsAccnt sa=new SavingsAccnt("ABC1234",1000);
        sa.showBalance();
        sa.deposit(900);
        sa.withdraw(100);
        sa.showBalance();
    }
}
