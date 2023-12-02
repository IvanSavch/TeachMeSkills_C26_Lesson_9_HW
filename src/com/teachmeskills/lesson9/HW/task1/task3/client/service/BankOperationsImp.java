package com.teachmeskills.lesson9.HW.task1.task3.client.service;

import com.teachmeskills.lesson9.HW.task1.task3.client.card.BaseCard;

public class BankOperationsImp implements IBankOperations {
    private static final double CONVERSION_USD = 3.12;
    private static final double CONVERSION_EUR = 3.4;
    private static final double CONVERSION_RUB = 28.50;

    public void bankTransfer(BaseCard fromCard, int CVV, BaseCard toCard, int amount) {
        if (fromCard == null || toCard == null) {
            return;
        }
        double balanceCardFrom = fromCard.getCountSum();
        double balanceCardTo = toCard.getCountSum();
        double percent = (amount * fromCard.commission()) / 100;
        if (fromCard.getCvv() != CVV) {
            System.out.println("entered incorrectly CVV");
            return;
        }
        if (balanceCardFrom - amount -percent > 0) {
            if (fromCard.checkTransferLimits(amount)) {
                fromCard.setCountSum(balanceCardFrom - amount - percent);
                System.out.println("the commission fee is " + percent);
                toCard.setCountSum(balanceCardTo + amount);
            } else System.out.println("insufficient funds");
        } else System.out.println("insufficient funds for transfer");
    }
    @Override
    public void addMoney(BaseCard card, int cardNumber, int count) {
        if (card.getCardNumber() != cardNumber) {
            return;
        }
        if (count < 0) {
            System.out.println("you cannot deposit this amount " + count);
            return;
        }
        card.setCountSum(card.getCountSum() + count);
    }

    @Override
    public void withdrawMoney(BaseCard card, int cardNumber, int count) {
        if (card.getCardNumber() != cardNumber) {
            return;
        }
        if (card.getCountSum() - count < 0) {
            return;
        }
        if (count < 0) {
            System.out.println("you cannot withdraw this amount " + count);
            return;
        }
        card.setCountSum(card.getCountSum() - count);
    }

    @Override
    public void conversion(BaseCard card, String currency) {
        double balanceCard = card.getCountSum();
        switch (currency) {
            case "USD":
                card.setCountSum(balanceCard / CONVERSION_USD);
                break;
            case "EUR":
                card.setCountSum(balanceCard / CONVERSION_EUR);
                break;
            case "RUB":
                card.setCountSum(balanceCard * CONVERSION_RUB);
                break;
        }
    }
}

