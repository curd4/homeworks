
package math;


public class myMath {
    
    public static double calcGeron (double a, double b, double c)
    {
        double p = (a + b + c)/ 2.0;
        double Area = Math.sqrt(p * (p - a) * (p - b) * (p - c) );
        return Area;
    }
    
     public static double calcPifagor (double a, double b)
    {
        double p = Math.pow(a,2) + Math.pow(b,2);
        double Area = Math.sqrt(p);
        return Area;
    }
    
     public static double calcDistance (double x1, double x2, double y1, double y2)
    {
        double p = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        double distance = p;
        return distance;
    }
}
