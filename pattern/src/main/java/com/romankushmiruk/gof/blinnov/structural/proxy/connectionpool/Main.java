package com.romankushmiruk.gof.blinnov.structural.proxy.connectionpool;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionPool<ProxyConnection> pool = new ConnectionPool<>(20);
        //ConnectionPool<Connection> pool1 = new ConnectionPool<>(30);
    }
}
