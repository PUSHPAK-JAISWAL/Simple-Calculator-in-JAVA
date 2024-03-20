// this is a class to perform nessecary calculations
class Calculations 
{
    void calculations(double i, char k,double j) throws Exception
    {
        try
        {
            switch(k)
            {
                case '+': System.out.println("The chosen operation is addition : ");
                            System.out.println(i+" + "+j+" = "+(i+j));
                            break;
                case '-': System.out.println("The chosen operation is substration : ");
                            System.out.println(i+" - "+j+" = "+(i-j));
                            break;
                case '/': System.out.println("The chosen operation is divison : ");
                            System.out.println(i+" / "+j+" = "+(i/j));
                            break;
                case '*': System.out.println("The chosen operation is multiplication : ");
                            System.out.println(i+" * "+j+" = "+(i*j));
                            break;
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Oops.. Something went wrong.");
        }
    }
}