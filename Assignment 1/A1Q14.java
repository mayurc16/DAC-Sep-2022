import java.util.Scanner;
class A1Q14{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number 1:");
	int num1= sc.nextInt();
	System.out.println("Enter a Number 2:");
	int num2= sc.nextInt();
	
	int gcd=0, loop;
	if(num1>num2)
		loop=num1;
	else 
		loop=num2;
	
	for(int i=2;i<=loop; i++)
	{
		if(num1%i==0&&num2%i==0)
		{ gcd=i;
		}
	}
	if(gcd!=0)
		System.out.println("GCD of "+num1+" and "+num2+" is:"+gcd);
	else
		System.out.println("NO Gcd Found");
	}
}