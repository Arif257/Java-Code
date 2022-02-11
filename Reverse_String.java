
package Practics;

import java.util.Scanner;


public class Reverse_String {
    
     public static void main(String[] args) {
        
     String txt,result ;
     result="";
    
     Scanner input = new Scanner(System.in);
    
     txt = input.nextLine();
     
     
         for (int i = txt.length()-1; i >= 0; i--) {
             
             result = result+txt.charAt(i);
         }
         
         System.out.println(""+result);
     
    }
    
    
}
