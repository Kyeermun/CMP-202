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
public class Prime {
     public static void main(String[] args){
      
	boolean IsPrime=true;
	Scanner calm= new Scanner(System.in);
	System.out.println("Enter a number to check if it's a prime number:");
	
	int num=calm.nextInt();
	for(int i=2; i<=num/2; i++)
	{
          int fill=num%i;
	   if(fill==0)
	   {
	      IsPrime=false;
	      break;
	   }
	}
	
	if(IsPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
    }
    
}
