import java.util.Scanner;

class A1Q16{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number 1:");
		int num1 = input.nextInt();
		System.out.println("Enter a number 2:");
		int num2 = input.nextInt();
		int lcm = 1;
			
		
		System.out.println("The LCM of "+num1+" and "+num2+" is/are: ");
		int divisor = 2;
		while(divisor<=num1 && divisor<=num2){
			
			if(num1%divisor==0 && num2%divisor==0){
				
				num1 = num1 / divisor;
				num2 = num2 / divisor;
				lcm = lcm * divisor;
			}
			else
				divisor++;	
		}
		lcm = lcm * num1 * num2 ;
		System.out.println(lcm);
	} 
}