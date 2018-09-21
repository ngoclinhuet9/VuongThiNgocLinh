package com.company;

public class Week03 {

    public static void main(String[] args) {
        int a=4;
        int b = 8;
        System.out.println("UCLN cua 2 so la: " + grestestCommonDivisor(a,b));
        System.out.print("So Finabocci thu n: ");
        Finabocci(b);



    }
    public static int grestestCommonDivisor(int x1, int x2){
        int max = 1;
        for(int i = 1; i < x1 + 1;i++){
            if((x1%i == 0)&&(x2 % i == 0)&&(i > max))
                max = i;
        }
        return max;
    }
    public  static  void Finabocci(int n){
        int n1 = 0, n2 = 1, n3 = 0;
        for(int i = 2;i <n;i ++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
    }
}
