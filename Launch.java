// this is the program for a simple calculator
public class Launch {
    public static void main(String args[]) throws Exception
    {
        perform();
    }
    static void perform() throws Exception
    {
        double a, b;
        char c;
        InputNumbers in = new InputNumbers();
        InputOperator io = new InputOperator();
        Calculations ca= new Calculations();
        a = in.inputNumber();
        b = in.inputNumber();
        c=  io.inputoperator();
        ca.calculations(a,c,b);
        Continue con = new Continue();
        con.ContinueCalculator();
    }
}
