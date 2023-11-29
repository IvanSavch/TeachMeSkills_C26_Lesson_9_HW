package com.teachmeskills.lesson9.HW.task1.task3.client.service;

import com.teachmeskills.lesson9.HW.task1.task3.client.card.BaseCard;

public interface IBankOperations {
    void bankTransfer(BaseCard fromCard, int CVV, BaseCard toCard, int amount);

    void addMoney(BaseCard card,int cardNumber,int count);
    void withdrawMoney(BaseCard card,int cardNumber,int count);
    void conversion(BaseCard card,String currency);
}
