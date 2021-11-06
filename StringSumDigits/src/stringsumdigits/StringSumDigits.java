
package stringsumdigits;

import java.util.Scanner;


public class StringSumDigits {

    
    public static void main(String[] args) {
        
        System.out.println("введите число ");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        
        int n = s.length();
        int numLastChar = n -1;
        for(int i = numLastChar; i >= 0; i--)
        {
            System.out.println(s.charAt(i));
        }
        
        int a = Integer.parseInt(s);
        System.out.print(a);
        
        String j = null;
        
        //for(int i = 0; i >= n; i--)
        //{
            //for (int q =0;q >=1;q--)
            //{
               // boolean result = s[i].contains(j);
                //if (result == true)
                //{
                //    q=q+1;
                //}
           // }
        //}
    }
    
}
