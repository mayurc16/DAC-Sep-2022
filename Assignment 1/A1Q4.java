import java.util.*;  
class A1Q4   
{  
    public static void main(String args[])   
    {   
		Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of a and b");  
        
       
        int a=sc.nextInt();  
        int b=sc.nextInt();  
        System.out.println("before swapping numbers: "+a+" "+b);  
        
        a =a + b;   
        b =a - b;   
        a =a - b;   
        System.out.println("After swapping: "+a+"  "+b);   
    }   
}  