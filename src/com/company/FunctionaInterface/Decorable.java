package com.company.FunctionaInterface;

@FunctionalInterface
public interface Decorable {

    // one abstract method
    void decorateWithCurtains();

    // default method
    default void decorateWithPaints(){
        System.out.println("Decorating Using Paints");
    }

    // overriding method of java.lang.object
    @Override
    public int hashCode();


}
