package com.designparttern.template_method;
/**
 * Behavioral Pattern: Template
 * What: A Template Pattern says that "just define the skeleton of the function
 *       in an operation, deferring some steps to its subclasses"
 * Why: It is very common technique for reusing the code. This is only the main benefit of it
 * When: It is used when the common behavior among sub-class should be moved to
 *       a single common class by avoiding duplication
 * */


public class Main {
    public static void main(String[] args) {
    Page htmlPage = new HtmlPage();
    Page pdfPage = new PdfPage();

    htmlPage.print();
    pdfPage.print();
    }
}
