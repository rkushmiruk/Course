package com.romankushmiruk.gof.blinnov.structural.bridge;

public class CreditAccount extends Account {
    private double limitCredit;

    public double getLimitCredit() {
        return limitCredit;
    }

    public CreditAccount(Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("Performing by credit account:");
        double maxSum = getAction().defineMaxSum();
        double payment = getAction().increasePayment();
        System.out.print("accountID: " + getId() + " increase monthly payments: " + payment);
        System.out.print(": recording of changes in the state accounts");
        System.out.println(" : withdrawal :" + sum);
        return true;
    }
}
