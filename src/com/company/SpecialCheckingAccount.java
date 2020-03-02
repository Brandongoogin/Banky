package com.company;

public class SpecialCheckingAccount extends CheckingAccount {
    private double interestRate;
    private double minimumBalance;


    public SpecialCheckingAccount (int idNumber, double startBal, double cc, double ir, double minBal){
        super(idNumber, startBal, cc);
        interestRate = ir;
        minimumBalance = minBal;
    }
    
}
