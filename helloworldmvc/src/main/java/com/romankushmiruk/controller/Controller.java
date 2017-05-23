package com.romankushmiruk.controller;

import com.romankushmiruk.Util.GlobalConstants;
import com.romankushmiruk.model.Model;
import com.romankushmiruk.view.View;

import java.util.Scanner;

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
        inputWordFromConsole(GlobalConstants.HELLO_WORD, sc);
        inputWordFromConsole(GlobalConstants.WORLD_WORD, sc);

        //Output
        view.printMessageAndData(GlobalConstants.OUTPUT_MESSAGE, model.getMessage());
    }

    // The Utility method
    private void inputWordFromConsole(String msg, Scanner sc) {
        view.printMessage(GlobalConstants.INPUT_MESSAGE);
        while (sc.hasNextLine()) {
            String result = sc.nextLine();
            if (result.compareToIgnoreCase(msg) == 0) {
                model.addMessage(result);
                view.printMessage(GlobalConstants.SUCCESS_MESSAGE);
                return;
            } else {
                view.printMessage(GlobalConstants.WRONG_INPUT_DATA);
            }
        }
    }

}
