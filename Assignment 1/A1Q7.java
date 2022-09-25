import java.util.Scanner;

class A1Q7{
	static int i=0;
	static int Return(int n)
{    
	   if(i<=10)
	   {   System.out.println(i);
		return Return(++i) ; 
	   }
	   else 
		   return 0;
		
} 
	public static void main(String args[]){
	int i=0;
	System.out.println(Return(i));
	
	
	}	
}
