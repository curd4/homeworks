
package stringwordstester1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;


public class StringWordsTester1 {

    
    public static void main(String[] args) {
        
        System.out.println("введите предложение");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] words = s.split(" ");
        int n = words.length;
        System.out.printf("Вы ввели слов %d", n);
        
        s=trim(s);
        for(int i=0; i>=n; i++)
        {
            System.out.println(words[i]);
        }
    }
    
}
