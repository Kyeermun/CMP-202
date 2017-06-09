/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmp202;
import java.util.Scanner;

/**
 *
 * @author sammuel
 */
public class Classfor {
    public static void main (String [] args)
    {
       Scanner input = new Scanner (System.in);
       System.out.println("Where do you want to start");
       int start = input.nextInt();
               
               System.out.println("Where do you want to end");
       int end = input.nextInt();
               if (start < end){
               for(int i = start; i < end; i++){
               System.out.println(i);
               }
               
               }
               else
               {
               System.out.println("Start should be less than end");
               }
               
       
    
}
}