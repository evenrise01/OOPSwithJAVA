//JAVA Program to demonstrate the real scenario of JAVA Method Overriding
//where three classes are overriding the method of a parent class
class Bank{

  int getRateofInterest()
{
  return 0;
}
}

//Creating CHild classes
class SBI extends Bank
{
  int getRateofInterest(){
    return 8;
  }
}
class ICICI extends Bank
{
  int getRateofInterest(){
    return 7;
  }
}

//Test class to create objects and call methods

class AXIS extends Bank
{
  int getRateofInterest(){
    return 8;
  }
}

public class Test 2{
  public static void main(String args[]){
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();

    System.out.println("SBI Rate of Interest: " +s.getRateofInterest());
    System.out.println("ICICI Rate of Interest: " +i.getRateofInterest());
    System.out.println("AXIS Rate of Interest: " +a.getRateofInterest());
  }
}
