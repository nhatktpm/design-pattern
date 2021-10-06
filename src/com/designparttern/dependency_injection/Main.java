package com.designparttern.dependency_injection;

/**
 * What: Dependency Injection is a design pattern that removes the dependency from programing code so
 *       that it can be easy manage and test the application.
 * Why: DI allows a client the flexibility of being configurable, testing can be performed using mock object
 * Where: Object oriented programing
 * When: you need inject the same dependency into multiple component and inject different implementation
 *       of the same dependency
 *
 * */


public class Main {
    public static void main(String[] args) {
        IService service = new ServiceB();
        IClient client = new ClientB(service);
        ClientA client2 = new ClientA();
        client2.setService(service);

        client.printInfo();
        client2.printInfo();
    }
}
