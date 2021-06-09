package com.company.FunctionaInterface;

public class DecorableMain {

    public static void main(String[] args) {
        Decorable dec=()->System.out.println("Decorating With Curtains");
        dec.decorateWithCurtains();
        dec.decorateWithPaints();
    }
}
