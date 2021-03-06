package com.romankushmiruk.controller;

import com.romankushmiruk.model.entity.*;
import com.romankushmiruk.view.View;

import java.util.Scanner;


public class Utils {
    private View view;
    private Scanner scanner;

    public Utils(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    private String inputValueStringWithRegex(String regex) {
        String value = scanner.next();
        while (!(value.matches(regex))) {
            view.showWrongInput();
            value = scanner.next();
        }
        return value;
    }



    public Note inputNewNoteToNoteBook() {

        Note note = new Note();
        note.setSubscriber(inputNewSubscriber());
        note.setSubscriberContacts(inputSubscribersContacts());
        note.setGroup(inputGroupForSubscriber());
        note.setAddress(inputAddressForSubscriber());
        note.setComment(inputComment());

        return note;
    }

    private Subscriber inputNewSubscriber() {
        String name;
        String surname;
        String patronymic;
        String nickName;

        view.inputName();
        name = inputValueStringWithRegex(RegularExpressions.REG_NAME);
        view.inputSurname();
        surname = inputValueStringWithRegex(RegularExpressions.REG_NAME);
        view.inputPatronymic();
        patronymic = inputValueStringWithRegex(RegularExpressions.REG_NAME);
        view.inputNickname();
        nickName = inputValueStringWithRegex(RegularExpressions.REG_NICKNAME);

        return new Subscriber(name, surname, patronymic, nickName);
    }

    private SubscriberContacts inputSubscribersContacts() {
        String homeNumber;
        String mobileNumber1;
        String mobileNumber2;
        String email;
        String skype;

        view.inputHomeNumber();
        homeNumber = inputValueStringWithRegex(RegularExpressions.REG_HOME_NUMBER);
        view.inputMobileNumber1();
        mobileNumber1 = inputValueStringWithRegex(RegularExpressions.REG_MOBILE_NUMBER1);
        view.inputMobileNumber2();
        mobileNumber2 = inputValueStringWithRegex(RegularExpressions.REG_MOBILE_NUMBER2);
        if ("next".equals(mobileNumber2)) {
            mobileNumber2 = "";
        }
        view.inputEmail();
        email = inputValueStringWithRegex(RegularExpressions.REG_EMAIL);
        view.inputSkype();
        skype = inputValueStringWithRegex(RegularExpressions.REG_SKYPE);

        return new SubscriberContacts(homeNumber, mobileNumber1, mobileNumber2, email, skype);
    }

    private Group inputGroupForSubscriber() {
        String value;

        view.inputGroup();
        view.printAllGroups();

        while (true) {
            value = scanner.next();
            try {
                return Group.fromString(value);
            } catch (IllegalArgumentException ex) {
                view.showWrongInput();
            }
        }
    }

    private Address inputAddressForSubscriber() {
        String index;
        String town;
        String street;
        String houseNumber;
        String flat;

        view.inputIndex();
        index = inputValueStringWithRegex(RegularExpressions.REG_INDEX);
        view.inputTown();
        town = inputValueStringWithRegex(RegularExpressions.REG_TOWN);
        view.inputStreet();
        street = inputValueStringWithRegex(RegularExpressions.REG_STREET);
        view.inputHouseNumber();
        houseNumber = inputValueStringWithRegex(RegularExpressions.REG_HOUSE_NUMBER);
        view.inputApartmentNumber();
        flat = inputValueStringWithRegex(RegularExpressions.REG_APARTMENT_NUMBER);

        return new Address(index, town, street, houseNumber, flat);
    }

    private String inputComment() {
        String comment;

        view.inputComment();

        while (true) {
            comment = scanner.next();
            if (!comment.isEmpty()) {
                return comment;
            }
        }
    }

}
