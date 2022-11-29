package org.example;

public class Prymougolnik {
    private double a, b;

    private double sq, per;

    public Prymougolnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean check(){
        boolean exst;
        if(a > 0 & b> 0){
            exst = true;
        }
        else{
            exst = false;
        }
        return exst;

    }

    public double Per(){
        return 2.0f * (a + b);
    }

    public double Square(){
        return a * b;
    }


}
