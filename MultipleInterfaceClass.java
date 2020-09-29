interface FirstInterface //parent1
{
  public void myMethod(); // interface method
}

interface SecondInterface //parent2
{
  public void myOtherMethod(); // interface method
}

//syntax 
// class NameClass implements Parent1,parent2
//class nameClas extends parent1, parent2
class DemoClass implements FirstInterface, SecondInterface  // multiple inheritance 
{
  public void myMethod() // Data member of FirstInterface Class which is our parent1
  {
    System.out.println("Successfully inheritated first parent");
  }
  public void myOtherMethod() // Data member of SecondInterface Class which is our parent2
  {
    System.out.println("Successfully inheritated second parent");
  }
}

public class MultipleInterfaceClass {
  public static void main(String[] args) 
  {
   
public class MultipleInterfaceClass {
  public static void main(String[] args) 
  {
    DemoClass myObj = new DemoClass(); // creation pf object of child class
    myObj.myMethod();//parent1
    myObj.myOtherMethod();//parent2
  }
}
