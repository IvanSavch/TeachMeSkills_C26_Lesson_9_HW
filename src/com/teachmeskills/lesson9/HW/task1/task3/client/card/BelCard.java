package com.teachmeskills.lesson9.HW.task1.task3.client.card;

public class BelCard extends BaseCard{
    private static final double COMMISSION_BEL_CARD = 2;
    public static final int TRANSFER_LIMIT_BEL_CARD = 7;

    public BelCard(long id, int cardNumber, int cvv, double countSum) {
        super(id, cardNumber, cvv, countSum);
    }
    @Override
    public boolean checkTransferLimits(double amount) {
        if (getCountSum() - amount < TRANSFER_LIMIT_BEL_CARD){
            return false;
        }
        return true;
    }

    @Override
    public double commission() {
        return COMMISSION_BEL_CARD;
    }

    @Override
    public String toString() {
        return "BelCard{" +
                "cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", countSum=" + countSum +
                '}';
    }
}


