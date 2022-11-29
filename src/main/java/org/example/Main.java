package org.example;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны для прямоугольника: ");
        System.out.println("а: "); double a = scanner.nextDouble();
        System.out.println("b: "); double b = scanner.nextDouble();
        Prymougolnik prym = new Prymougolnik(a, b);
        if(prym.check()){
            System.out.println("Площадь прямоугольника: " + prym.Square());
            System.out.println("Периметр прямоугольника: " + prym.Per());
        } else{
            throw new RuntimeException("There is no figure with such parameters.");
        }

        System.out.println("Введите стороны для треугольника: ");
        System.out.println("а: "); double tr_a = scanner.nextDouble();
        System.out.println("b: "); double tr_b = scanner.nextDouble();
        System.out.println("b: "); double tr_c = scanner.nextDouble();
        Triangle triangle = new Triangle(tr_a, tr_b, tr_c);
        if(triangle.check()){
            System.out.println("Площадь треугольника : " + triangle.Square());
            System.out.println("Периметр прямоугольника: " + triangle.Per());
        } else {
            throw new RuntimeException("There is no figure with such parameters.");
        }


        System.out.println("Введите радиус для окружности: ");
        System.out.println("а: "); double rad = scanner.nextDouble();
        Circle circle = new Circle(rad);
        if(circle.check()){
            System.out.println("Площадь окружности : " + circle.Square());
            System.out.println("Периметр окружности: " + circle.Per());
        } else{
            throw new RuntimeException("There is no figure with such parameters.");
        }


    }
}