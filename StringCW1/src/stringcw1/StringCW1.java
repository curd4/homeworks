
package stringcw1;


public class StringCW1 {

   
    public static void main(String[] args) {

        String a = "аргентина манит негра, а роза упала на лапу азора";
        
        String[] words = a.split(" ");
        int b = words.length;
        String a1 = words[0];
        String a2 = words[1];
        String a3 = words[2];
        String a4 = words[3];
        String a5 = words[4];
        String a6 = words[5];
        String a7 = words[6];
        String a8 = words[7];
        String a9 = words[8];
        
        int n = a.length();
        int numLastChar = n -1;
        
        for(int i = numLastChar; i >= 0; i--)
        {
            
            System.out.print(a.charAt(i));     
            
        }
        if (n >= 4)
        {
            String newString = a.substring(1,3 + 1);
            System.out.print(newString);
        }
        
    }
    
}
