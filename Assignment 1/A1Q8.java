import java.util.Scanner;

class A1Q8{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num = sc.nextInt();
	int temp,rev=0;
	
	while(num>0){
		temp = num%10;
		rev=rev*10+temp;
		num=num/10;
		}	
		
	System.out.println("You Have Entered ->");
	
	while(rev>0){
		temp = rev%10;
		System.out.print(" "+temp);
		rev=rev/10;
		}
	}	
}