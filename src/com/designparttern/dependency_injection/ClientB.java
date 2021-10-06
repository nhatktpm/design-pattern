package com.designparttern.dependency_injection;

public class ClientB implements IClient {
    IService service;

    public ClientB(IService service) {
        this.service = service;
    }

    @Override
    public void printInfo() {
        System.out.println(service.getInfo());

    }
}
