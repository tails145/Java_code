package com.company;

class Circle {
    private static int r;
    private final double PI = 3.142;
    public static int getR() {
        return r;
    }
    Circle(int R) {
        r = R;
    }
    public double Circumference() {
        return this.PI * 2 * r;
    }
    public double Space() {
        return this.PI * r * r;
    }
    public static void setR(int r) {
        Circle.r = r;
    }
    public double getPI() {
        return PI;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle example = new Circle(2);
        double C = example.Circumference();
        double S = example.Space();
        System.out.println("周长为" + C +  " " + "面积为" + S);
    }
}
