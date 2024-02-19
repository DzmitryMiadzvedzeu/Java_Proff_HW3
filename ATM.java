package com.telran.org.homework_3.newHomework;


public abstract class ATM {
    private String name;

    private double moneyValue;

    private String type;





    public ATM(String name, double moneyValue, String type) {
        this.name = name;
        this.moneyValue = moneyValue;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyValue() {
        return moneyValue;
    }

    public void setMoneyValue(double moneyValue) {
        this.moneyValue = moneyValue;
    }

    public abstract void withdrawalMoney(CreditCard creditCard, double amount);

    public abstract void depositingMoney(CreditCard creditCard, double amount);

    public abstract boolean pinCheck(CreditCard creditCard, int pin);
}
