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
public class Class3 {
     public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age ");
        int x = scan.nextInt();
        
        while(x <  18)
        {
            System.out.println("Do You want to continue?  yes or no");
            String conditionFactor = scan.nextLine();
        if(conditionFactor.equals("no"))
            break;
        System.out.println("you are too young for this ");
        //x++;
        }
       
   
                
        
    }
    
}
