import java.util.*;
class SumNumbers
{

public static void main(String args[])
{
    int a,sum=0;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter a Number:");
    a = s.nextInt();

    while (a != 0) 
        { 
            sum = sum + a % 10; 
            a = a/10; 
        } 
System.out.println("The sum of the integers are:" + sum);
}
}
