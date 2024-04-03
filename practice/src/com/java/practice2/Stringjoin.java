package com.java.practice2;

public class Stringjoin {
    private String a = "";
    private String b = "";
    private String c = "";

    public Stringjoin() {
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String joinStrings() {
        StringBuilder result = new StringBuilder();
        result.append(a);
        result.append(b);
        result.append(c);
        return result.toString();
    }
}
