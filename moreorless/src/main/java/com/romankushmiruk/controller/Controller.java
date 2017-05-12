package com.romankushmiruk.controller;

import com.romankushmiruk.model.Model;
import com.romankushmiruk.view.View;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by roman on 12.05.17.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(int min, int max) {
        checkNumber(min, max);
    }

    public void processUser() {
        checkNumber(0, View.RAND_MAX);
    }

    private void checkNumber(int min, int max) {
        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }
        model.setNumber(rand(min, max));
        int userNumber;
        int secretNumber = model.getNumber();
        while (true) {
            userNumber = inputValueInRange(min, max);
            if (userNumber == secretNumber) {
                view.printMessageAndInt(View.SUCCESS_MESSAGE, model.getNumber());
                view.printMessage(model.getUserNumbers().toString());
                return;
            }
            if (userNumber < secretNumber) {
                view.printMessage(View.LESS_NUMBER);
                min = userNumber;
            }
            if (userNumber > secretNumber) {
                view.printMessage(View.GREATER_NUMBER);
                max = userNumber;
            }
        }
    }

    private int rand(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    private int inputValueInRange(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        while (true) {
            view.printRange(min, max);
            userNumber = inputIntValueWithScanner(scanner);
            model.getUserNumbers().add(userNumber);
            if (userNumber > max || userNumber < min) {
                view.printMessage(View.NUMBER_NOT_RANGE);
            } else {
                return userNumber;
            }
        }
    }

    private int inputIntValueWithScanner(Scanner scanner) {
        view.printMessage(View.INPUT_NUMBER);
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.INPUT_NUMBER);
            scanner.next();
        }
        return scanner.nextInt();
    }

}
