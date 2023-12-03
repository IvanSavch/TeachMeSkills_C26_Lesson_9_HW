package com.teachmeskills.lesson9.HW.task3.model.card.impl;

import com.teachmeskills.lesson9.HW.task3.model.card.BaseCard;

public class MasterCard extends BaseCard {
    private static final double COMMISSION_MASTER_CARD = 2.5;
    private static final int TRANSFER_LIMIT_MASTER_CARD = 10;

    public MasterCard(long id, int cardNumber, int cvv, double countSum) {
        super(id, cardNumber, cvv, countSum);
    }
    @Override
    public boolean checkTransferLimits(double amount) {
        if (getCountSum() - amount < TRANSFER_LIMIT_MASTER_CARD){
            return false;
        }
        return true;
    }

    @Override
    public double commission() {
        return COMMISSION_MASTER_CARD;
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", countSum=" + countSum +
                '}';
    }
}
