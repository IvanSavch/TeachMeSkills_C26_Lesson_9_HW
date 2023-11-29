package com.teachmeskills.lesson9.HW.task1.task3.client.starter;

import com.teachmeskills.lesson9.HW.task1.task3.client.card.BaseCard;
import com.teachmeskills.lesson9.HW.task1.task3.client.card.MasterCard;
import com.teachmeskills.lesson9.HW.task1.task3.client.card.VisaCard;

public class Starter {
    public static void main(String[] args) {
        BaseCard visaCard = new VisaCard(1,1234,333,55.5);
        BaseCard masterCard = new MasterCard(2,3212,123,560.5);
        System.out.println(masterCard);
        visaCard.bankTransfer(333,3212,10);
        System.out.println(masterCard.toString());
        System.out.println(visaCard);
    }
}
