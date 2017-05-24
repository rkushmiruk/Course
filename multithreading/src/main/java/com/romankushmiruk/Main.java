package com.romankushmiruk;

import com.romankushmiruk.controller.Controller;
import com.romankushmiruk.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.processUser();
    }
}
