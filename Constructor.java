public class DemoConstructor 
{
    int x; //instance variable
 
  public DemoConstructor() // Zero constructor
//  void getSum()
     {
    x = 5;  
    System.out.println(x);
        }

  public static void main(String[] args) {
    DemoConstructor  myObj = new DemoConstructor(); // creation of object
    //int y= myObj.x;
    //System.out.println(y); // Print the value of x
  }
}
