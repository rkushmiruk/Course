package com.romankushmiruk.util;

import java.util.Locale;
import java.util.ResourceBundle;

public interface StringConstants {
    String messageName = "message";
    ResourceBundle stringConstants = ResourceBundle.getBundle(messageName);

    String INPUT_NAME = stringConstants.getString("INPUT_NAME");
    String INPUT_SURNAME = stringConstants.getString("INPUT_SURNAME");
    String INPUT_PATRONYMIC = stringConstants.getString("INPUT_PATRONYMIC");
    String INPUT_NICKNAME = stringConstants.getString("INPUT_NICKNAME");
    String INPUT_HOME_NUMBER = stringConstants.getString("INPUT_HOME_NUMBER");
    String INPUT_MOBILE_NUMBER1 = stringConstants.getString("INPUT_MOBILE_NUMBER1");
    String INPUT_MOBILE_NUMBER2 = stringConstants.getString("INPUT_MOBILE_NUMBER2");
    String INPUT_EMAIL = stringConstants.getString("INPUT_EMAIL");
    String INPUT_SKYPE = stringConstants.getString("INPUT_SKYPE");
    String INPUT_INDEX = stringConstants.getString("INPUT_INDEX");
    String INPUT_TOWN = stringConstants.getString("INPUT_TOWN");
    String INPUT_STREET = stringConstants.getString("INPUT_STREET");
    String INPUT_HOUSE_NUMBER = stringConstants.getString("INPUT_HOUSE_NUMBER");
    String INPUT_APARTMENT_NUMBER = stringConstants.getString("INPUT_APARTMENT_NUMBER");
    String INPUT_COMMENT = stringConstants.getString("INPUT_COMMENT");
    String INPUT_GROUP = stringConstants.getString("INPUT_GROUP");
    String WRONG_INPUT_DATA = stringConstants.getString("WRONG_INPUT_DATA");
}
