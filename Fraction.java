package com.company;
class Fraction{
   private int numerator, denominator;
    public static void main(String[] args) {

        Fraction frac1 = new Fraction(12,13);
        Fraction frac2 = new Fraction(3, 4);
        plusFraction(frac1,frac2);
        if(compareFractions(frac1,frac2) == true)
            System.out.println("\nHai phan so bang nhau");
        else
            System.out.println("\nHai phan so khong bang nhau");
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public  int getDenominator(){
        return denominator;
    }
    public Fraction(){

    }
    public Fraction(int nume , int deno){
        numerator = nume;
        denominator = deno;
    }
    public static int grestestCommonDivisor(int x1, int x2){
        int max = 1;
        for(int i = 1; i < x1 + 1;i++){
            if((x1%i == 0)&&(x2 % i == 0)&&(i > max))
                max = i;
        }
        return max;
    }
    public static void reduceFraction(Fraction Frac){
        int commonDivisor = grestestCommonDivisor(Frac.getNumerator(),Frac.getDenominator());
        int a = Frac.getNumerator()/commonDivisor;
        int b = Frac.getDenominator()/commonDivisor;
        Frac.setDenominator(b);
        Frac.setNumerator(a);
    }
    public static void plusFraction(Fraction Frac1, Fraction Frac2){
        int newNumerator = Frac2.getNumerator()*Frac1.getDenominator() + Frac1.getNumerator()*Frac2.getDenominator();
        int newDenominator = Frac1.getDenominator() * Frac2.getDenominator();
        Fraction newFrac = new Fraction(newNumerator,newDenominator);
        reduceFraction(newFrac);
        System.out.print(newFrac.getNumerator());
        System.out.print("/"+ newFrac.getDenominator());
    }
    public static boolean compareFractions(Fraction Frac1, Fraction Frac2){
        reduceFraction(Frac1);
        reduceFraction(Frac2);
        if((Frac1.getNumerator() == Frac2.getNumerator())&&(Frac1.getDenominator() == Frac2.getDenominator()))
            return true;
        else
            return false;
    }


}
