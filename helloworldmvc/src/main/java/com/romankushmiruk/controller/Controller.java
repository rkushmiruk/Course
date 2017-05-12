package com.romankushmiruk.controller;

import com.romankushmiruk.model.Model;
import com.romankushmiruk.view.View;

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
        inputWordFromConsole(View.HELLO_WORD, sc);
        inputWordFromConsole(View.WORLD_WORD, sc);

        //Output
        view.printMessageAndData(View.OUTPUT_MESSAGE, model.getMessage());
    }

    // The Utility method
    private void inputWordFromConsole(String msg, Scanner sc) {
        view.printMessage(View.INPUT_MESSAGE);
        while (sc.hasNextLine()) {
            String result = sc.nextLine();
            if (result.compareToIgnoreCase(msg) == 0) {
                model.addMessage(result);
                view.printMessage(View.SUCCESS_MESSAGE);
                return;
            } else {
                view.printMessage(View.WRONG_INPUT_DATA);
            }
        }
    }

}
