package com.designparttern.template_method;

public class HtmlPage extends Page{

    @Override
    void printHeader() {
        System.out.println("HTML Header");
    }

    @Override
    void printBody() {
        System.out.println("HTML Body");
    }

    @Override
    void printFooter() {
        System.out.println("HTML Footer");
    }
}
