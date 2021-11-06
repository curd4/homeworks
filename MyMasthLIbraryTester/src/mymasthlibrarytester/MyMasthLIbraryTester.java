
package mymasthlibrarytester;

import math.myMath;


public class MyMasthLIbraryTester {

   
    public static void main(String[] args) {
       
        double a = 3;
        double b = 4;
        double c = 5;
        double S = myMath.calcGeron(a, b, c);
        System.out.println("площадь треугольника равна = "+S);
        
        double a1 = 3;
        double b1 = 4;
        double c1 = myMath.calcPifagor(a1, b1);
        System.out.println("гипотенуза = "+c1);
        
        double a2 = 1;
        double b2 = 3;
        double c2 = 1;
        double d2 = 1;
        double D = myMath.calcDistance(a2, b2,c2, d2);
        System.out.println("расстояние между точками равно = "+D);
    }
    
}
