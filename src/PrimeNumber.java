import java.util.Scanner;

/* 
*	Assignment 10 
*	Program-1 
*	Write java program to check whether number is prime or not(Prime number 
*	means which is divisible by two numbers only i.e. 1 and itself only. 
*	if any number is divisible by any other number except mentioned 
then 
*	its not prime number. 
 */ 
public class PrimeNumber { 
 
 	public static void main(String[] args) { 
 
 	 	System.out.println("Enter the number");  	
 	 	Scanner scanner = new Scanner(System.in); 
 	 	int no = scanner.nextInt();  
 	 	
 	 	/*int count = 0;  	 	
 	 	for (int i = no; i > 0; i--) {  	 	 	
 	 		if (no % i == 0) { 
 	 	 	 	count++; 
 	 	 	} 
 	 	} 
 	 	if (count > 2) { 
 	 	 	System.out.println("Number is not prime.."); 
 	 	} else { 
 	 	 	System.out.println("Number is prime.."); 
 	 	} */
 	 	//2nd way
 	 	int count = 0;  	 	//ex. no=7
 	 	for (int i = 2; i <=no-1; i++) {  //i<=no-1 must, for no=2 	
 	 		if (no % i == 0) {    //if cond. for>>not prime no.
 	 	 	 	count++;  //or count=count+1
 	 	 	} 
 	 	} 
 	 	/*if (count > 0) { 
 	 	 	System.out.println("Number is not prime.."); 
 	 	} else { 
 	 	 	System.out.println("Number is prime.."); 
 	 	} */
 	 	//or
 	 	if (count== 0) { 
 	 	 	System.out.println("prime"); 
 	 	} else { 
 	 	 	System.out.println("not prime.."); 
 	 	} 
 	}
 	
} 
