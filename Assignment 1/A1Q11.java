import java.util.Scanner;
 class A1Q11{
	 public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
	
		if(x<y&&x<z)
			System.out.println(x+" is Smallest");
		else if(y<z)
			System.out.println(y+" is Smallest");
		else	
			System.out.println(z+" is Smallest");
	}
 }