import java.util.Scanner;

class A1Q6{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Year:");
	int num=sc.nextInt();
	
	if(num%400==0)
		System.out.println("Its a leap year");	
	else if(num%100==0)
		System.out.println("Its not a leap year");
	else if (num%4==0)
		System.out.println("Its a leap year");
	else
		System.out.println("Its not a leap year");
	
	}
	
}