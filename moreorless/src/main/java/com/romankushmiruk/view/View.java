package com.romankushmiruk.view;

import java.util.ResourceBundle;

/**
 * Created by roman on 12.05.17.
 */
public class View {
    private static String resourceName = "StringConstants";
    private static ResourceBundle stringConstants = ResourceBundle.getBundle(resourceName);

    public static String WRONG_INPUT_DATA = stringConstants.getString("wrong_input_data");
    public static String INPUT_NUMBER = stringConstants.getString("input_number");
    public static int RAND_MAX = Integer.parseInt(String.valueOf(stringConstants.getString("rand_max")));
    public static String RANGE_MESSAGE_PART1 = stringConstants.getString("range_message_part1");
    public static String RANGE_MESSAGE_PART2 = stringConstants.getString("range_message_part2");
    public static String NUMBER_NOT_RANGE = stringConstants.getString("number_not_range");
    public static String SUCCESS_MESSAGE = stringConstants.getString("success_message");
    public static String LESS_NUMBER = stringConstants.getString("less_number");
    public static String GREATER_NUMBER = stringConstants.getString("greater_number");

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + " " + value);
    }

    public void printRange(int min, int max) {
        System.out.println(RANGE_MESSAGE_PART1 + " " + min + " " + RANGE_MESSAGE_PART2 + " " + max);
    }
}
