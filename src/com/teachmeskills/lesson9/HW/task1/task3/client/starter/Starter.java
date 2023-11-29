package com.teachmeskills.lesson9.HW.task1.task3.client.starter;




import java.text.ParseException;


/**
 * Create a program for transferring from one client’s bank card to his other card.
 * The data for translation is specified from the console.
 * There is a client.
 * The system stores information about the client’s first name, last name, passport number, and date of birth.
 * As well as his postal code, country, city, street and house number.
 * The client may have a bank card (one or more).
 * Make a method to transfer an amount from one multiple to another.
 * Each card contains the card number, CVC/CVV, current amount on the card, card code(id).
 * Cards can be of three types: BelCard, MasterCard, VisaCard.
 * There are limits on transfers.
 * Limits are checked only for the card from which the transfer is made.
 * Each type of card has its own limits.
 * Cards may be in different currencies - therefore, provide for conversion.
 * A commission is charged for the transfer (set as a percentage).
 * Provide for various checks and validations.
 */
public class Starter {

    public static void main(String[] args) throws ParseException {
        new Controller().start();
    }

}
