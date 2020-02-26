package com.company;

public class SavingsAccount extends Account {
    private double annualInterest;


    public SavingsAccount(int idNumber, double startBal, double ai) {
        super(idNumber, startBal);
        annualInterest = ai;
    }

    public void withdraw(double amount ){
        if(amount <= currentBalance()) {
            super.decreaseBalance(amount);
        }
        public double monthlyInterst(double w){
                



    }


}
