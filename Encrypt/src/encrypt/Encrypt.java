package encrypt;

import java.util.Scanner;

public class Encrypt {
	
	     public static void main (String args [] ) {
	          int num1;//variable declarations
	          int num2; 
	          int num3; 
	          int num4;
	          int encryptNum;
	          int num;
	          
	          Scanner scnr = new Scanner(System.in); //Scanner initialized
	          
	          System.out.println("Enter a 4-digit number to be encrypted: ");//Prompt user for number for encryption
	          num = scnr.nextInt();//Gather number input
	          
	          num1 = (num / 1000 + 7) % 10;//Begin encryption of adding 7 and getting remainder
	          num2 = (num % 1000 / 100 + 7) % 10;
	          num3 = (num % 100 / 10 + 7) % 10;
	          num4 = (num % 10 + 7) % 10;
	          
	          encryptNum = (num1 * 10 + num2) + (num3 * 1000 + num4 * 100);//Swap numbers
	          
	          System.out.println("Encrypted number is " + encryptNum);//Output encrypted number
	          }
	     }

