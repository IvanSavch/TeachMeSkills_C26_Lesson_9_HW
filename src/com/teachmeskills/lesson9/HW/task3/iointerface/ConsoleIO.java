package com.teachmeskills.lesson9.HW.task3.iointerface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO implements IOInterface{
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public String readStringValue() throws IOException {
        return bufferedReader.readLine();
    }
}
