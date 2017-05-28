package com.romankushmiruk.gof.blinnov.structural.proxy.connectionpool;


import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;

public class ConnectionPool<T> {
    private ArrayBlockingQueue<T> connectionQueue;

    public ConnectionPool(final int POOL_SIZE) throws SQLException {
        connectionQueue = new ArrayBlockingQueue<T>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            T connection = null;//create connection
            connectionQueue.offer(connection);
        }
    }

    public T getConnection() throws InterruptedException {
        T connection = null;
        connection = connectionQueue.take();
        return connection;
    }

    public void closeConnection(T connection) {
        connectionQueue.offer(connection); // возможны утечки соединений
    }

    // more methods;
}
