//this is a program to input the numbers of the numbers
import java.util.InputMismatchException;
import java.util.Scanner;

class InputNumbers {
    double inputNumber() 
    {
        try 
        {
            double a;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            a = sc.nextDouble();
            return a;
        } 
        catch (InputMismatchException ime) 
        {
            WrongChoice wc = new WrongChoice();
            return wc.wrongChoice(); // Return the result of wrongChoice()
        }
    }
}

class WrongChoice {
    double wrongChoice() 
    {
        System.out.println("Oops.. Something went wrong.");
        char c;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Do you want to continue? \nEnter Y if YES \nEnter N if NO");
        System.out.println("Enter the Input : ");
        c = sc1.next().charAt(0);
        if (c == 'y' || c == 'Y') 
        {
            InputNumbers in = new InputNumbers();
            return in.inputNumber(); // Return the result of inputNumber()
        } 
        else if (c == 'n' || c == 'N') 
        {
            System.out.println("Exiting the calculator");
            System.exit(0);
        } 
        else 
        {
            System.out.println("Wrong input. Please Try again.");
            return wrongChoice(); // Recursive call
        }
        return 0;
    }
}