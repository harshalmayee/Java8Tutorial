package com.company.Lambda;

public class ThreadSample {
    public static void main(String[] args) {
        // Old way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Is Started");
            }
        }).start();

        // using Lambda expression
        new Thread(()->System.out.println("Thread is Started...")).start();
    }
}
