package com.teachmeskills.lesson9.HW.task1.task3.client.card;

public abstract class BaseCard {
    private long id;
    protected int cardNumber;
    protected int cvv;
    protected double countSum;

    public BaseCard(long id, int cardNumber, int cvv, double countSum) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.countSum = countSum;
    }
    public abstract void bankTransfer(int yourCVV,int cardNumber,double countSum);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getCountSum() {
        return countSum;
    }

    public void setCountSum(double countSum) {
        this.countSum = countSum;
    }

    @Override
    public String toString() {
        return "BaseCard{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", countSum=" + countSum +
                '}';
    }
}
