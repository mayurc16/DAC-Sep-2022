import java.util.Scanner;

class A1Q17{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	
	int temp=0,rev=0,pal=num;
	
	
	while(num>0)
	{
		temp=num%10;
		rev=rev*10+temp;
		num=num/10;
	}
	if (pal==rev)
		System.out.println(pal+" is a pallindrome number");
	else
		System.out.println(pal+" is not a pallindrome number");
		
	}
}