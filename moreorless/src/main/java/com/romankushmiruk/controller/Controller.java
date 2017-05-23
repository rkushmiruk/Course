package com.romankushmiruk.controller;

import com.romankushmiruk.util.GlobalConstants;
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

    public void processUser(int min, int max) {
        model.setSecretNumber(model.rand(min, max));
        playGame();
    }

    public void processUser() {
        model.setSecretNumber(model.rand());
        playGame();
    }

    private void playGame() {
        while (true) {
            if (model.checkNumber(inputValueInRange(model.getMinValue(), model.getMaxValue()))) {
                view.printMessageAndInt(GlobalConstants.SUCCESS_MESSAGE, model.getSecretNumber());
                return;
            }
            view.printMessage(GlobalConstants.NUMBER_NOT_RANGE);
        }
    }

    private int inputValueInRange(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        while (true) {
            view.printRange(min, max);
            userNumber = inputIntValueWithScanner(scanner);
            model.getUserNumbers().add(userNumber);
            if (userNumber > max || userNumber < min) {
                view.printMessage(GlobalConstants.NUMBER_NOT_RANGE);
            } else {
                return userNumber;
            }
        }
    }

    private int inputIntValueWithScanner(Scanner scanner) {
        view.printMessage(GlobalConstants.INPUT_NUMBER);
        while (!scanner.hasNextInt()) {
            view.printMessage(GlobalConstants.WRONG_INPUT_DATA);
            view.printMessage(GlobalConstants.INPUT_NUMBER);
            scanner.next();
        }
        return scanner.nextInt();
    }

}
