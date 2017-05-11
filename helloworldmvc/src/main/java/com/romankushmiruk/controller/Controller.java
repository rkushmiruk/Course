package com.romankushmiruk.controller;

import com.romankushmiruk.model.Model;
import com.romankushmiruk.view.View;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by roman on 11.05.17.
 */
public class Controller {
    private ResourceBundle stringConstants = ResourceBundle.getBundle("StringConstants");
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        //input
        inputWordFromConsole(stringConstants.getString("HELLO_WORD"), sc);
        inputWordFromConsole(stringConstants.getString("WORLD_WORD"), sc);

        //Output
        view.printMessageAndData(stringConstants.getString("OUTPUT_MESSAGE"), model.getMessage());
    }

    // The Utility method
    private void inputWordFromConsole(String msg, Scanner sc) {
        view.printMessage(stringConstants.getString("INPUT_MESSAGE"));
        while (sc.hasNextLine()) {
            String result = sc.nextLine();
            if (result.compareToIgnoreCase(msg) == 0) {
                model.addMessage(result);
                view.printMessage(stringConstants.getString("SUCCESS_MESSAGE"));
                return;
            } else {
                view.printMessage(stringConstants.getString("WRONG_INPUT_DATA"));
            }
        }
    }


}
