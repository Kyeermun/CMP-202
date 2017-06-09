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
public class Classswitch {
     public static void main (String [] args)
    {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter multiples of 5 less than 20");
       int start = input.nextInt();
       switch(start)
       {
           case 20:
               System.out.println("blah");
                
               break;
           case 15:
               System.out.println("boom");
               
               break;
           case 10:
               System.out.println("blis");
               break;
           case 5:
               System.out.println("ski");
               break;
           default:
               System.out.println("defS");
               break;
       }    
}
}