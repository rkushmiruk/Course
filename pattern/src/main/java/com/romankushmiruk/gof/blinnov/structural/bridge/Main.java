package com.romankushmiruk.gof.blinnov.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Action action = new RegularAction();
        DepositAccount depositAccount = new DepositAccount(action);
        depositAccount.setId(777);
        depositAccount.setAmount(1500);
        depositAccount.takeSum(200);
        action = new UrgentAction();
        depositAccount.setAction(action); // replacement action
        depositAccount.takeSum(100);
        new CreditAccount(action).takeSum(50);
    }
}
