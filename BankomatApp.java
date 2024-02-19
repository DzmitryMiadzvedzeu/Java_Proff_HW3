package com.telran.org.homework_3.newHomework;

import java.util.Scanner;

public class BankomatApp {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(1111, 0000, 100000, "EUR");

        ATM[] atms = {
                new ATMTwo("BSB Bank", 500000, "USD"),
                new ATMThree("KGK Bank", 500000, "USD"),
                new ATMTwo("VCV Bank", 500000, "USD"),
                new ATMOne("PKO Bank", 500000, "USD"),
        };

        for (ATM atm : atms) {
            if (atm instanceof Converter) {
                Scanner scannerOne = new Scanner(System.in);
                System.out.println("Please, enter pin code from credit card");
                int pinCode = scannerOne.nextInt();
                if (atm.pinCheck(creditCard, pinCode)) {
                    System.out.println("Your account balance : " + creditCard.getValue() + " EUR");
                    Scanner scannerTwo = new Scanner(System.in);
                    System.out.println("Chose the operation : withdrawal - 1, depositing - 2");
                    int choice = scannerTwo.nextInt();
                    switch (choice) {
                        case 1:
                            Scanner scannerThree = new Scanner(System.in);
                            System.out.println("Please, enter amount");
                            int valueOne = scannerThree.nextInt();
                            scannerThree.close();
                            atm.withdrawalMoney(creditCard, ((Converter) atm).convert(valueOne));
                        break;
                        case 2:
                            Scanner scannerFour = new Scanner(System.in);
                            System.out.println("Please, enter amount");
                            int valueTwo = scannerFour.nextInt();
                            scannerFour.close();
                            atm.depositingMoney(creditCard, ((Converter) atm).convert(valueTwo));
                        break;
                    }
                    System.out.println("Thanks for using ATM from " + atm.getName());
                    System.out.println("Account balance : " + creditCard.getValue() + " USD, card number : " +
                            creditCard.getNumber());
                    System.out.println("ATM balance : " + atm.getMoneyValue() + " USD");
                    scannerTwo.close();
                    break;
                }
                System.out.println("!!! WRONG PIN CODE !!!");
                scannerOne.close();
                break;
            } else {
                System.out.println("Sorry this ATM from " + atm.getName() + " are unable to help you");
            }
        }
    }
}
