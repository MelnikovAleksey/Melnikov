package com.company;

import java.util.Locale;

public class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(Fraction f){
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }
    public void add(Fraction f){
        this.numerator += f.numerator;
    }
    public void sub(Fraction f){
        this.numerator -= f.numerator;
    }
    public void multiply(Fraction f){
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
    }
    public void divide(Fraction f){
        this.numerator *= f.denominator;
        this.denominator *= f.numerator;
    }

    @Override
    public String toString(){return String.format(Locale.US, "%d / %d", this.numerator, this.denominator);}
}
