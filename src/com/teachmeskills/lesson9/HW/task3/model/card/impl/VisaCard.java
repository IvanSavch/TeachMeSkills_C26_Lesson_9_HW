package com.teachmeskills.lesson9.HW.task3.model.card.impl;

import com.teachmeskills.lesson9.HW.task3.model.card.BaseCard;

public class VisaCard extends BaseCard {
    private static final double COMMISSION_VISA_CARD = 3;
    private static final int TRANSFER_LIMIT_VISA_CARD = 5;
    public VisaCard(long id, int cardNumber, int cvv, double countSum) {
        super(id, cardNumber, cvv, countSum);
    }
    @Override
    public boolean checkTransferLimits(double amount) {
        if (getCountSum() - amount < TRANSFER_LIMIT_VISA_CARD){
            return false;
        }
        return true;
    }

    @Override
    public double commission() {
        return COMMISSION_VISA_CARD;
    }

    @Override
    public String toString() {
        return "VisaCard{" +
                "cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", countSum=" + countSum +
                '}';
    }
}
