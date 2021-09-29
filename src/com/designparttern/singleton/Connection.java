package com.designparttern.singleton;

public class Connection {
    private static Connection _instance;

    private Connection() {
    };

    public static Connection getInstance() {
        if (_instance == null) {
            synchronized (Connection.class) {
                if (_instance == null) _instance = new Connection();
            }
        }
        return _instance;
    };
}
