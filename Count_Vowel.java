
package Practics;

import java.util.Scanner;


public class Count_Vowel {
    
    public static void main(String[] args) {
        
        String txt,txt1,txt2;
        int vowel,consonent;
        vowel = 0;
        consonent = 0;
        
        
        System.out.println("Please enter the charecter: ");
        
        Scanner input = new Scanner(System.in);
        
        txt = input.nextLine();
        txt1 = txt.toLowerCase();
        txt2 = txt1.replaceAll("\\s+","");
        
        for (int i = 0; i < txt2.length(); i++) {
            
            char result = txt2.charAt(i);
            
            if(result == 'a' || result =='e' || result =='i' || result =='o' || result =='u' ){
                
                vowel++;
                //System.out.println(" "+ txt2.charAt(i));
            }
            else if(txt2.charAt(i) > 'a' && txt2.charAt(i) < 'z'){
                consonent++;
                //System.out.println(" "+ txt2.charAt(i));
              
            }
            else{
//                consonent++;
                  System.out.println("Not found txt");
            
            }
            
           
        }
            System.out.println("Toral Vowel number is: "+vowel);
            System.out.println("Toral consonent number is: "+consonent);
            System.out.println("Toral Vowel number is: "+txt2.length());
        
        
    }
    
}
