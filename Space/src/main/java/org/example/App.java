package org.example;

public class App
{
    public static void main (String [] arg) {
        double a;
        double b;
        double c;
        triangle(4,4,5);
        triangleArea(4, 4,5);
    }
    private static void triangle(double a, double b, double c) {
        if ((a + b) > c && (b + c) > a  && (a + c) > b) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
    private static double triangleArea(double a, double b, double c) {

        double s = (((a + b + c) / 2) * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) * 2 - c));
        System.out.println("Площадь треугольника равна:" +s);
        return Math.sqrt(s);
    }

}

