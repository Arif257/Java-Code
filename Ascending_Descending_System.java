
package Practics;

import java.util.Arrays;



public class Ascending_Descending_System {
    
    
    public static void main(String[] args) {
        
    
        int num[] = {1,5,3,7,3,8,6,9,2,4};
        
        Arrays.sort(num);
        System.out.print("Ascending number is: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
         System.out.println("");
         System.out.println("\n");
         
         
         System.out.print("Descending number is: ");
         
        for (int i =  num.length-1; i > 0; i--) {
            System.out.print(" "+num[i]);
        }
         System.out.println("");
         System.out.println("\n");
         
         
         System.out.print("Ascending Char is: ");
         char txt[]={'a','d','b','c','f','e'};
         
         Arrays.sort(txt);
         
         for (int i = 0; i < txt.length-1; i++) {
             System.out.print(" "+txt[i]);
        }
         System.out.println("");
         
         System.out.print("Descending Char is: ");
         
         for (int i = txt.length-1; i >= 0; i--) {
             System.out.print(" "+txt[i]);
        }
         System.out.println("");
    }
}
