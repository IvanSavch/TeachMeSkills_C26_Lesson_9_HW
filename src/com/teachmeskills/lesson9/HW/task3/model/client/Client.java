package com.teachmeskills.lesson9.HW.task3.model.client;

import com.teachmeskills.lesson9.HW.task3.model.address.Address;
import com.teachmeskills.lesson9.HW.task3.model.card.BaseCard;

public class Client {
    private String name;
    private String surName;
    private String passportNumber;
    private String dateBirthday;
    private Address address;
    private BaseCard[] cards;

    public Client(String name, String surName, String passportNumber, String dateBirthday, Address address, BaseCard[] cards) {
        this.name = name;
        this.surName = surName;
        this.passportNumber = passportNumber;
        this.dateBirthday = dateBirthday;
        this.address = address;
        this.cards = cards;
    }
    public void countCard() {
        for (BaseCard b: getCards()) {
            System.out.println(b);
        }
    }
    public BaseCard getCard(int id) {
        int count = -1;
        for(BaseCard baseCard: cards){
            count++;
            if (baseCard.getId() == id) {
                break;
            }
        }
        return cards[count];
    }
    /*public BaseCard transferFrom(int id) {
        switch (id) {
            case 1:
                return  getCards()[0];
            case 2:
                return getCards()[1];
            case 3 :
                return getCards()[2];
            default:
                System.out.println("no such card");
        }
        return null;
    }
    public BaseCard transferTo(int id) {
        return transferFrom(id);
        }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\n' +
                " surName='" + surName + '\n' +
                " passportNumber='" + passportNumber + '\n' +
                " dateBirthday=" + dateBirthday + '\n' +
                  address + '\n' +
                '}';
    }

}
