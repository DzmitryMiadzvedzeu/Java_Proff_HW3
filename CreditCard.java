package com.telran.org.homework_3.newHomework;

import com.telran.org.lesson_15.Printer;

public class CreditCard {

    private int number;
    private int pin;
    private double value;
    private String type;

    public CreditCard(int number, int pin, double value, String type) {
        this.number = number;
        this.pin = pin;
        this.value = value;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
