//Write a program for Narrowing Casting

public class Myclass {

    public static void main(String[] args){

        int myInt;
        double myDouble = 9.85 //Automatic casting: double to int
        
        
        myInt = (int)myDouble;
        
        System.out.println(myDouble);
        System.out.println("After applying Narrowing Casting");
        System.out.println(myInt);
    }
}
