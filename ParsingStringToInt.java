//Write a program for converting the type from string to integer

public class MyClass {
    public static void main(String[] args){

        String str = "10";
        System.out.println("The original value of String before conversion " + str);

        int myInt = Integer.parseInt(str); //Parse int method is used to parse the string value to int value

        System.out.println("After applying type conversion from String to Integer");
        System.out.println(myInt);
    }
}
