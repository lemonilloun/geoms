package org.example;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean check(){
        boolean exst = false;
        if(a > 0 || b > 0 || c > 0){
            if (a < b + c || b < a + c || c < b  + a){
                exst = true;
                return exst;
            }
        }
        return exst;
    }

    public double Per(){
        return a + b + c;
    }

    public double Square(){
        double p = Per()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
