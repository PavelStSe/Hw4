package ru.gb.lesson3;


public class Hw4 {
    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}



