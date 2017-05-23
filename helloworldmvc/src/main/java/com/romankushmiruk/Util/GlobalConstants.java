package com.romankushmiruk.Util;

import java.util.ResourceBundle;

public interface GlobalConstants {
    String resourceName = "StringConstants";
    ResourceBundle stringConstants = ResourceBundle.getBundle(resourceName);

    String HELLO_WORD = stringConstants.getString("hello_world");
    String WORLD_WORD = stringConstants.getString("world_word");
    String WRONG_INPUT_DATA = stringConstants.getString("wrong_input_data");
    String INPUT_MESSAGE = stringConstants.getString("input_message");
    String OUTPUT_MESSAGE = stringConstants.getString("output_message");
    String SUCCESS_MESSAGE = stringConstants.getString("success_message");
}
