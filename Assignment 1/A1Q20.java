import java.util.Scanner;

class A1Q20{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	
	for(int i=1;i<=num;i=i+2)
	System.out.println(i+" ");
	
	}
}