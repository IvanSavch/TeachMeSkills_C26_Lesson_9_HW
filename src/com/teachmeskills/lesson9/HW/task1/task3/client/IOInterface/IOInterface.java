package com.teachmeskills.lesson9.HW.task1.task3.client.IOInterface;

import java.io.IOException;

public interface IOInterface {
    String MENU_LEGEND = "1. Add money" + '\n' +
            "2. withdrawMoney money" +'\n' +
            "3. Conversion " + '\n' +
            "4. Bank transfer " + '\n' +
            "5. Cards" + '\n' +
            "e. exist";
    String MENU_CARDS = "1.Visa card" + '\n'
            + "2.Master card" + '\n'
            + "3. Bel card";

    String readStringValue() throws IOException;

}
