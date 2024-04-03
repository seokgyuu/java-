package com.java.practice2;

public class Stringjoinapp {
    public static void main(String[] args) {
        Stringjoin joiner = new Stringjoin();
        
        joiner.setA("superman");
        joiner.setB("batman");
        joiner.setC("spiderman");
        
        String result = joiner.joinStrings();
        System.out.println(result);
    }
}
