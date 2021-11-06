
package stringexample;
import java.util.Scanner;


public class StringExample {


    public static void main(String[] args) {
        
        System.out.println("Как вас зовут");
        Scanner input = new Scanner(System.in);
        
        //String name = input.nextLine();
        String name = input.next();
        //String name = input.next("");
        
        System.out.println("ну, привет, " + name);
        
        int n = name.length();
        int numLastChar = n -1;
        for(int i = numLastChar; i >= 0; i--)
        {
            System.out.println(name.charAt(i));
        }
        if (n >= 4)
        {
            String newString = name.substring(1,3 + 1);
            System.out.println(newString);
        }
        
        String[] words = name.split(" ");
        int M = words.length;
        String firstName = words[0];
        String lastName = words[1];
        
        System.out.printf("Вы ввели слов %d, это имя = %s и фамилия = %s", M, firstName, lastName);
        
        boolean result = name.contains(lastName);
        if (result == true)
        {
            System.out.println("строка = "+name+" содержит строку "+lastName);
            
        }
    }
    
}
