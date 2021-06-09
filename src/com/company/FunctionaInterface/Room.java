package com.company.FunctionaInterface;

public class Room implements Decorable,Paintable {
    @Override
    public void decorateWithCurtains() {
        System.out.println("Decorating with curtains");
    }

    @Override
    public void decorateWithPaints() {
        System.out.println("Decorating with paints");
    }

}
