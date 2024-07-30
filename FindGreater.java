import java.io.*;
import java.util.Scanner;
public class FindGreater {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter First Number:");
        a=sc.nextInt();
        System.out.println("Enter second Number:");
        b=sc.nextInt();
        if(a > b)
        {
            System.out.println("a is greater"+a);
        }
        else
        {
            System.out.println("b is greater"+b);
        }
    }
}
