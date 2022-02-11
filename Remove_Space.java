
package Practics;

import java.util.Scanner;


public class Remove_Space {
    public static void main(String[] args) {
        
        String txt,txt1;
        
        System.out.println("Please Input any text here: ");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        
        txt1 = txt.replaceAll("\\s+","");
        System.out.println("Remove Space: "+txt1);
        System.out.println("total Length: "+txt1.length());
    }
}
