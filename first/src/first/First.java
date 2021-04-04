/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;
import java.util.Scanner;

/**
 *
 * @author KIMBERLET EPELLE
 */
public class First {

    /**
     * @param args the command line arguments
     */
     
     public static void main(String args[]) 
     { 
         System.out.println("Hello Java_change");
         int x,y,z;
         System.out.println("enter the integers to calculate their sum");
         Scanner in = new Scanner(System.in);
         x = in.nextInt();
         y = in.nextInt();
         z = x+y;
         System.out.println("sum of entered integers = "+z);
         
         int marksObtained, passingMarks;
         
         passingMarks = 40;
         Scanner input = new Scanner(System.in);
         System.out.println("input marks scored by you");
         marksObtained = input.nextInt();
         
         if(marksObtained >=passingMarks){
         System.out.println("you passed the exam.");
   
         }
         else{
         System.out.println("you failed the exam.");
         }
         
         
     }
}
        // TODO code application logic here
    
    

