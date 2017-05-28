package com.romankushmiruk.gof.blinnov.behavioral.memento;

import java.util.HashMap;

public class RequestParameter {
    private HashMap<String, String> param = new HashMap<>();

    public RequestParameter(HashMap<String, String> param) {
        this.param = param;
    }

    public Memento getMemento() {
        HashMap<String, String> state = (HashMap<String, String>) (param.clone());
        return new RequestParameterMemento(state);
    }

    public void setMemento(Memento object) {
        if (object instanceof RequestParameterMemento) {
            RequestParameterMemento memento = (RequestParameterMemento) object;
            param = memento.state;
        }
    }

    private class RequestParameterMemento implements Memento {
        private HashMap<String, String> state;

        RequestParameterMemento(HashMap<String, String> state) {
            this.state = state;
        }
    }

    public void addParam(String key, String value) {
        param.put(key, value);
    }

    public HashMap<String, String> getParams() {
        return param;
    }

    public void removeParam(String key) {
        param.remove(key);
    }

    public void clearParams() {
        param = new HashMap<String, String>();
    }
}
