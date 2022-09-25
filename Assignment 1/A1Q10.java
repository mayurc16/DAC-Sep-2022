import java.util.Scanner;
class A1Q10{
	public static void main(String args[]){;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int sum=0,temp=0;
	while(num>0){
		temp=num%10;
		sum=sum+temp;
		num=num/10;
		}
	System.out.println("Sum of digits of number is:"+sum);
	}
}