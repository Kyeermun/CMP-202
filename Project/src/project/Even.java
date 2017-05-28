/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author PANAAN KYEERMUN
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input your value :");

    Scanner input = new Scanner(System.in);
         int val = input.nextInt();

    if ( val % 2 == 0 )
        System.out.println("Your number is even");
     else
        System.out.println("Your number is odd");
    }
    
}
