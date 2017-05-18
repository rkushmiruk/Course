package com.romankushmiruk;

import com.romankushmiruk.controller.Controller;
import com.romankushmiruk.model.Model;
import com.romankushmiruk.model.entity.Group;
import com.romankushmiruk.view.View;

import java.util.Arrays;

/**
 * Created by roman on 14.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
