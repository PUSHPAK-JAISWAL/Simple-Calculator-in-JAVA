// this is a class to input the operator in the class
import java.util.*;
class InputOperator
{
    char inputoperator() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        char operator;
        while (true) 
        {
            System.out.println("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break; // Exit the loop if a valid operator is entered
            } 
            else 
            {
                System.out.println("Invalid input. Please enter +, -, *, or /.");
            }
        }
        return operator;
    }
}