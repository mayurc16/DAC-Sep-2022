import java.util.Scanner;

class A1Q13{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a nummber");
	int num = sc.nextInt();
	int temp=0,rev=0;
	
	while(num>0)
	{
		temp=num%10;
		rev=rev*10+temp;
		num=num/10;
	}

	System.out.println("Reverse of a given number is:"+rev);
	}
}	