package com.romankushmiruk.controller;

import com.romankushmiruk.model.Model;
import com.romankushmiruk.view.View;

import java.util.Scanner;

/**
 * Created by roman on 14.05.17.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        model.saveNote(new Utils(view, scanner).inputNewNoteToNoteBook());
        View.print(model.getNoteBook().toString());
    }
}
