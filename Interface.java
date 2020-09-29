interface Animal // interface keyword for making a class as interface class
{
   public void eat();
   public void travel();
}

//rule:-
//1. for inheriting the interface class inside a simple class , we will be using implements class
//2. We will be using exends keyword for inheriting the interface class inside another interface class
//3. Multiple Implements is allowed but multipple extends is not allowed

public class MammalInt implements Animal // single level inheritance
{

 public void eat() // method overriding
   {
      System.out.println("Mammal eats");
   }

   public void travel() // method of parent interface class which is having name as Animal
   {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() 
   {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
} 
