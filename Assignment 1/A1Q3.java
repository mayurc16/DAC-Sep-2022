import java.util.Scanner;

class A1Q3{ 
 
static int factorial(int n)
{    
	if (n == 0)    
		return 1;    
	else    
		return(n * factorial(n-1));    
}    


 public static void main(String args[])
 {  Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");   
	int i,fact=1;  
	int num=sc.nextInt(); 
	 fact = factorial(num);       
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  