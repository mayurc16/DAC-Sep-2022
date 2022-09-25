import java.util.Scanner;
class A1Q12{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number 1:");
	int num1 = sc.nextInt();
	System.out.println("Enter number 2:");
	int num2 = sc.nextInt();
	int max=num1;
	int sum=num2;
	if(num2>num1){
	max=num2;
	sum=num1;
	}
	
	for(num2=0;num2<max;num2++)
	sum++;
	System.out.println(sum);
	}
}
	