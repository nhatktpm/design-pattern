package com.designparttern.template_method;

public abstract class Page {
    void print() {
        printHeader();
        printBody();
        printFooter();
    }

    abstract void printHeader();

    abstract void printBody();

    abstract void printFooter();
}
