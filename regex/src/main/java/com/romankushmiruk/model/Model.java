package com.romankushmiruk.model;

import com.romankushmiruk.model.entity.Note;
import com.romankushmiruk.model.entity.NoteBook;

/**
 * Created by roman on 14.05.17.
 */
public class Model {

    private NoteBook noteBook;

    public Model() {
        noteBook = new NoteBook();
    }

    public void saveNote(Note note) {
        noteBook.addNewNote(note);
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }
}
