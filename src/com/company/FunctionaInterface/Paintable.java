package com.company.FunctionaInterface;

public interface Paintable {

    default void decorateWithPaints(){
        System.out.println("Decorate With Paints");
    }
}
