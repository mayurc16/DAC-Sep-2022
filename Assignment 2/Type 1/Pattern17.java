import java.util.Scanner;
class Pattern17{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int k=1;
	for(int i=1; i<=5; i++)
	{ for(int j=1;j<=i;j++,k++)
		{	System.out.print(k+" ");
		}
	System.out.println();
	}
	
	}
}