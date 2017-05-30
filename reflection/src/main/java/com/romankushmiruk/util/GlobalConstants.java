package com.romankushmiruk.util;

import java.util.ResourceBundle;

public interface GlobalConstants {
    String resourceName = "StringConstants";
    ResourceBundle stringConstants = ResourceBundle.getBundle(resourceName);

    String MODIFIER_PUBLIC = stringConstants.getString("MODIFIER_PUBLIC");
    String MODIFIER_PROTECTED = stringConstants.getString("MODIFIER_PROTECTED");
    String MODIFIER_PRIVATE = stringConstants.getString("MODIFIER_PRIVATE");
    String MODIFIER_DEFAULT_PACKAGE = stringConstants.getString("MODIFIER_DEFAULT_PACKAGE");
    String MODIFIER_FINAL = stringConstants.getString("MODIFIER_FINAL");
    String MODIFIER_ABSTRACT = stringConstants.getString("MODIFIER_ABSTRACT");
    String MODIFIER_STATIC = stringConstants.getString("MODIFIER_STATIC");

    String CLASS_NAME = stringConstants.getString("CLASS_NAME");
    String CLASS_MODIFIERS = stringConstants.getString("CLASS_MODIFIERS");
    String CLASS_CONSTRUCTORS = stringConstants.getString("CLASS_CONSTRUCTORS");
    String CLASS_METHODS = stringConstants.getString("CLASS_METHODS");
    String SUPERCLASS = stringConstants.getString("SUPERCLASS");
    String CLASS_FIELDS = stringConstants.getString("CLASS_FIELDS");
    String CLASS_INTERFACES = stringConstants.getString("CLASS_INTERFACES");
    String METHODS_ANNOTATIONS = stringConstants.getString("METHODS_ANNOTATIONS");

}
