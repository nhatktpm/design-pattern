package com.designparttern.facade;

public class TwitterShare implements IShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message =message;
    }

    @Override
    public void share() {
        //Complicated...
        System.out.println("Share to Twitter" + message);
    }
}
