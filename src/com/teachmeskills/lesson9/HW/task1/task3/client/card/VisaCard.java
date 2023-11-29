package com.teachmeskills.lesson9.HW.task1.task3.client.card;

public class VisaCard extends BaseCard {
    VisaCard visaCard;
    BaseCard baseCard;
    MasterCard masterCard;

    public VisaCard(long id, int cardNumber, int cvv, double countSum) {
        super(id, cardNumber, cvv, countSum);
    }

    @Override
    public void bankTransfer(int yourCVV, int cardNumber1, double count) {
        if (yourCVV != cvv) {
            System.out.println("Veli is not faithful CVV");
            return;
        }
        setCountSum(getCountSum() - count);


    }

}
