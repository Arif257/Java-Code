
package Practics;

import java.util.Scanner;


public class Spring_Split {
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Plese Enter the any text: ");
        text = input.nextLine();
        //String txt = "My Name Is Numan";
        String result[]=text.split("\\s");
        
        for(String x : result){
        
            System.out.println(" "+x
            );
        }
        System.out.println("Total Array Length is: "+result.length);
    }
}
