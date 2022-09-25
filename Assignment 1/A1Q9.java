import java.util.Scanner;

class A1Q9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		System.out.println("Factors are:");
		for(int i=1;i<=num;i++){
			if(num%i==0){
				
				System.out.print(i+" ");	
			}	
		}
		
	}
}