package com.romankushmiruk.controller;

import com.romankushmiruk.model.Model;
import com.romankushmiruk.view.View;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by roman on 11.05.17.
 */
public class Controller {

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
        inputWordFromConsole(view.HELLO_WORD, sc);
        inputWordFromConsole(view.WORLD_WORD, sc);

        //Output
        view.printMessageAndData(view.OUTPUT_MESSAGE, model.getMessage());
    }

    // The Utility method
    private void inputWordFromConsole(String msg, Scanner sc) {
        view.printMessage(view.INPUT_MESSAGE);
        while (sc.hasNextLine()) {
            String result = sc.nextLine();
            if (result.compareToIgnoreCase(msg) == 0) {
                model.addMessage(result);
                view.printMessage(view.SUCCESS_MESSAGE);
                return;
            } else {
                view.printMessage(view.WRONG_INPUT_DATA);
            }
        }
    }


}
