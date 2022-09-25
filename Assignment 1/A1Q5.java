import java.util.Scanner;

class A1Q5{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	
	if(num<0)
		System.out.println("Negative Number");
	else 
		System.out.println("Positive Number");
	}
}
