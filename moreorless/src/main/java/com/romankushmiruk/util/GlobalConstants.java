package com.romankushmiruk.util;

import java.util.ResourceBundle;

/**
 * Created by roman on 17.05.17.
 */
public interface GlobalConstants {
    String resourceName = "StringConstants";
    ResourceBundle stringConstants = ResourceBundle.getBundle(resourceName);

    String WRONG_INPUT_DATA = stringConstants.getString("wrong_input_data");
    String INPUT_NUMBER = stringConstants.getString("input_number");
    int RAND_MAX = Integer.parseInt(String.valueOf(stringConstants.getString("rand_max")));
    String RANGE_MESSAGE_PART1 = stringConstants.getString("range_message_part1");
    String RANGE_MESSAGE_PART2 = stringConstants.getString("range_message_part2");
    String NUMBER_NOT_RANGE = stringConstants.getString("number_not_range");
    String SUCCESS_MESSAGE = stringConstants.getString("success_message");

}
