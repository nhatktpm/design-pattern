package com.designparttern.dependency_injection;

public class ServiceA implements IService{

    @Override
    public String getInfo() {
        return "Service A";
    }
}
