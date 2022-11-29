package org.example;

public class Circle {
    private double rad, sq, per;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double Square(){
        sq = rad * rad * 3.14f;
        return sq;
    }

    public boolean check(){
        boolean exst = false;
        if(rad > 0){
            exst = true;
            return exst;
        }
        return exst;
    }

    public double Per(){
        per = 2.0f * 3.14f * rad;
        return per;
    }



}
