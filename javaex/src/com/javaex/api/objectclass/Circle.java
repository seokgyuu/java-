package com.javaex.api.objectclass;

public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null && getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return radius == other.radius;
    }
}