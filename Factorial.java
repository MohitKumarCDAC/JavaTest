import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number To find Factorial:");
        int num=sc.nextInt();
        int fact=1;

        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
       
        System.out.println("Factorial is this");
        System.out.println("Factorial is this");

    }
}