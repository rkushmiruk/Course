package com.romankushmiruk.gof.blinnov.creational.prototype;

import java.util.List;

public interface Client<T> {
    T cloneElementById(Integer id);
    List<T> cloneElements(Object... param);
}
