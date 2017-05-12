package com.romankushmiruk.view;

import java.util.ResourceBundle;

/**
 * Created by roman on 11.05.17.
 */
public class View {
    private static String resourseName = "StringConstants";
    private static ResourceBundle stringConstants = ResourceBundle.getBundle(resourseName);

    public static String HELLO_WORD = stringConstants.getString("hello_world");
    public static String WORLD_WORD = stringConstants.getString("world_word");
    public static String WRONG_INPUT_DATA = stringConstants.getString("wrong_input_data");
    public static String INPUT_MESSAGE = stringConstants.getString("input_message");
    public static String OUTPUT_MESSAGE = stringConstants.getString("output_message");
    public static String SUCCESS_MESSAGE = stringConstants.getString("success_message");

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndData(String message, String data) {
        System.out.println(message + data);
    }
}
