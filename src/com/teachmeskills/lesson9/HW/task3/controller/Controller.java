package com.teachmeskills.lesson9.HW.task3.controller;


import com.teachmeskills.lesson9.HW.task3.iointerface.ConsoleIO;
import com.teachmeskills.lesson9.HW.task3.model.address.Address;
import com.teachmeskills.lesson9.HW.task3.model.card.impl.BelCard;
import com.teachmeskills.lesson9.HW.task3.model.client.Client;
import com.teachmeskills.lesson9.HW.task3.service.IBankOperations;
import com.teachmeskills.lesson9.HW.task3.iointerface.IOInterface;
import com.teachmeskills.lesson9.HW.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.HW.task3.model.card.impl.MasterCard;
import com.teachmeskills.lesson9.HW.task3.model.card.impl.VisaCard;
import com.teachmeskills.lesson9.HW.task3.service.BankOperationsImp;

import java.io.IOException;


public class Controller {

    IOInterface ioInterface;
    IBankOperations iBankOperations;
    BaseCard baseCard;
    Address address;
    Client ivan;

    public Controller() {
        this.ioInterface = new ConsoleIO();
        this.iBankOperations = new BankOperationsImp();
        this.baseCard = new VisaCard(1, 1234, 333, 5.5);
        this.baseCard = new MasterCard(2, 3212, 123, 560.5);
        this.baseCard = new BelCard(3, 12333, 456, 123.23);
        this.address = new Address(12331, "Belarus", "Minsk", "Part", 43);
        this.ivan = new Client("Ivan", "Savchenko", "TR34508", "13.04.2003", address, Controller.arrayCards());
    }
    public static BaseCard[] arrayCards() {
        BaseCard visaCard = new VisaCard(1, 1234, 333, 5.5);
        BaseCard masterCard = new MasterCard(2, 3212, 123, 560.5);
        BaseCard belCard = new BelCard(3, 12333, 456, 123.23);
        return new BaseCard[]{visaCard, masterCard, belCard};
    }
    public void start() {
        boolean count = true;
        while (count){
            try {
                count = mainProcess();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean mainProcess() throws IOException {
        System.out.println(IOInterface.MENU_LEGEND);
        String input = "";
        try {
            input = ioInterface.readStringValue();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        switch (input) {
            case "1":
                System.out.println(IOInterface.MENU_CARDS);
                BaseCard cardForAdd = ivan.getCard(Integer.parseInt(ioInterface.readStringValue()));
                System.out.println("enter number card");
                int numberCardForAdd = Integer.parseInt(ioInterface.readStringValue());
                System.out.println("enter count");
                int countAdd = Integer.parseInt(ioInterface.readStringValue());
                iBankOperations.addMoney(cardForAdd, numberCardForAdd, countAdd);
                System.out.println(baseCard);
                break;
            case "2":
                System.out.println(IOInterface.MENU_CARDS);
                BaseCard cardForWithdraw = ivan.getCard(Integer.parseInt(ioInterface.readStringValue()));
                System.out.println("enter number card");
                int numberCardForWithdraw = Integer.parseInt(ioInterface.readStringValue());
                System.out.println("enter count");
                int countWithdraw = Integer.parseInt(ioInterface.readStringValue());
                iBankOperations.withdrawMoney(cardForWithdraw, numberCardForWithdraw, countWithdraw);
                System.out.println(baseCard);
                break;
            case "3":
                System.out.println("enter currency ");
                String currency = ioInterface.readStringValue();
                System.out.println(IOInterface.MENU_CARDS);
                BaseCard cardForConversion = ivan.getCard(Integer.parseInt(ioInterface.readStringValue()));
                iBankOperations.conversion(cardForConversion, currency);
                System.out.println(baseCard);
                break;
            case "4":
                System.out.println(IOInterface.MENU_CARDS);
                System.out.println("enter number card for transfer");
                BaseCard cardForTransfer = ivan.getCard(Integer.parseInt(ioInterface.readStringValue()));
                System.out.println("enter number card to transfer");
                BaseCard cardToConversion = ivan.getCard(Integer.parseInt(ioInterface.readStringValue()));
                System.out.println("enter CVV card for transfer");
                int CVV = Integer.parseInt(ioInterface.readStringValue());
                System.out.println("enter amount");
                int amount = Integer.parseInt(ioInterface.readStringValue());
                iBankOperations.bankTransfer(cardForTransfer, CVV, cardToConversion, amount);
                System.out.println(baseCard);
                break;
            case "5" :
                ivan.countCard();
                break;
            case "e":
                return false;
            default:
                System.out.println("wrong input");
        }
        return true;
    }
}
