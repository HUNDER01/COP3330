package main;

import java.util.Scanner;

public class Decrypt {
    
		public static void main (String args [] ) {
			int num1;//variable declarations
			int num2; 
			int num3; 
			int num4; 
			int decryptNum;
			int num;
        
			Scanner scnr = new Scanner(System.in);//Scanner initialized
			
			System.out.println("Enter a 4-digit number to be decrypted: ");//Prompt user for number for decryption
			num = scnr.nextInt();//Gather number input
        
			num1 = (num / 1000 + 3) % 10;//Begin decryption process of backward encryption steps
			num2= (num % 1000 / 100 + 3) % 10;
			num3= (num % 100 / 10 + 3) % 10;
			num4=(num % 10 + 3) % 10;
        
			decryptNum= (num1 * 10) + num2 + (num3 * 1000) + (num4 * 100);//Swap numbers
        
			System.out.println("Decrypted number is " + decryptNum);//Output encrypted number
        	}
	}
