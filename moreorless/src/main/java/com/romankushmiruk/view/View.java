package com.romankushmiruk.view;

import com.romankushmiruk.util.GlobalConstants;

/**
 * Created by roman on 12.05.17.
 */
public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + " " + value);
    }

    public void printRange(int min, int max) {
        System.out.println(GlobalConstants.RANGE_MESSAGE_PART1 + " " + min + " " +
                GlobalConstants.RANGE_MESSAGE_PART2 + " " + max);
    }

}
