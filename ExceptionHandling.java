public class MyExceptionClass{

    public static void main(String []args)
    {
        try
        {
            int a=90;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("An Arithmetic exception has been there");
        }

        System.out.println("Remaining code");
}
}
