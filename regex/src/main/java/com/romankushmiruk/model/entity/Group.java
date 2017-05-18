package com.romankushmiruk.model.entity;

/**
 * Created by roman on 14.05.17.
 */
public enum Group {
    FAMILY("Family"),
    FRIENDS("Friends"),
    WORK("Work");

    private String text;

    Group(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static Group fromString(String text) {
        for (Group group : Group.values()) {
            if (group.text.equalsIgnoreCase(text)) {
                return group;
            }
        }
        return null;
    }
}
