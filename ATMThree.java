package com.telran.org.homework_3.newHomework;

public class ATMThree extends ATM {

    public ATMThree(String name, double moneyValue, String type) {
        super(name, moneyValue, type);
    }

    @Override
    public void withdrawalMoney(CreditCard creditCard, double amount) {
        if (super.getMoneyValue() > amount & creditCard.getValue() > amount){
            super.setMoneyValue(super.getMoneyValue() - amount);
            creditCard.setValue(creditCard.getValue() - amount);
            return;
        }
        System.out.println("Out of maximum money in ATM or on account");
    }

    @Override
    public void depositingMoney(CreditCard creditCard, double amount) {
        creditCard.setValue(creditCard.getValue() + amount);
        super.setMoneyValue(super.getMoneyValue() + amount);
    }

    public boolean pinCheck(CreditCard creditCard, int pin) {
        if (creditCard.getPin() == pin) {
            System.out.println("Success!");
            return true;
        }
        return false;
    }
}
