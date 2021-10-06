package com.designparttern.dependency_injection;

public class ClientA implements IClient{
    IService service;

    public IService getService() {
        return service;
    }

    public void setService(IService service) {
        this.service = service;
    }

    @Override
    public void printInfo() {
        System.out.println(service.getInfo());
    }
}
