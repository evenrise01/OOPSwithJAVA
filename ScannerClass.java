//Write a program to take input from user 
//Write a program to illustrate concept of scanner class

import java.lang.*;
//import <- keyword
import java.util.*;

public class UserInput // class declare
{
    public static void main(String[] args) {

        //syntax for object creation
        //Class obj_name = new Clas()
    

     Scanner sc = new Scanner(System.in); //sc is the object as scanner class which is used to call nextInt()

     System.out.println("Enter first number: ");
     int a = sc.nextInt();  //sc is the object 
     System.out.println("Enter second number: ");
     int b = sc.nextInt();
     System.out.println("Enter third number: ");
     int c = sc.nextInt();
     int d = a+b+c;

     System.out.println("Toatl = " +d);
}
