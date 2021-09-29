package com.designparttern.facade;

public class FBShare implements IShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message =message;
    }

    @Override
    public void share() {
        //Complicated...
        System.out.println("Share to Facebook" + message);
    }
}
