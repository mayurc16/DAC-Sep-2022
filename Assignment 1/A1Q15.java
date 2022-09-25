import java.util.Scanner;
class A1Q15{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1:");
	int num1=sc.nextInt();
	System.out.println("Enter number 2:");
	int num2=sc.nextInt();
	int i,temp=0;
	if(num1>num2)
	{	temp=num1;
		i=num2;
	}
	else
	{
		temp=num2;
		i=num1;
	}
	
		for(;i<=temp;i++)
		if (num1%i==0 && num2%i==0)
		{	temp=0;
			System.out.println("LCM of given two numbers is :"+i);
			break;
		}
		if(temp!=0)
		System.out.println("LCM of given two numbers is :"+(num1*num2));
			
	
	
}
}
