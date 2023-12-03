package com.teachmeskills.lesson9.HW.task3.service;

import com.teachmeskills.lesson9.HW.task3.model.card.BaseCard;

public interface IBankOperations {
    void bankTransfer(BaseCard fromCard, int CVV, BaseCard toCard, int amount);

    void addMoney(BaseCard card,int cardNumber,int count);
    void withdrawMoney(BaseCard card,int cardNumber,int count);
    void conversion(BaseCard card,String currency);
}
