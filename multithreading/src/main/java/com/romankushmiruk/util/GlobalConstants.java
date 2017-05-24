package com.romankushmiruk.util;

import java.util.ResourceBundle;

public interface GlobalConstants {
    String resourceName = "StringConstants";
    ResourceBundle stringConstants = ResourceBundle.getBundle(resourceName);

    String START_MESSAGE = stringConstants.getString("START_MESSAGE");
    String BIOLOGY_INSTITUTE = stringConstants.getString("BIOLOGY_INSTITUTE");
    String MATH_INSTITUTE = stringConstants.getString("MATH_INSTITUTE");
    String RANDOM_INSTITUTE = stringConstants.getString("RANDOM_INSTITUTE");
    String STUDENT_ADD_TO_QUEUE = stringConstants.getString("STUDENT_ADD_TO_QUEUE");

}
