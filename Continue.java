// this is a program to continue the calculations options
import java.util.*;
class Continue 
{
    void ContinueCalculator() throws Exception
    {
        char c;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Do you want to continue Calculations? \nEnter Y if YES \nEnter N if NO");
        System.out.println("Enter the Input : ");
        c = sc1.next().charAt(0);
        if (c == 'y' || c == 'Y') 
        {
            Launch launch = new Launch();
            launch.perform();
        } 
        else if (c == 'n' || c == 'N') 
        {
            System.out.println("Exiting the calculator");
            System.exit(0);
        } 
        else 
        {
            System.out.println("Wrong input. Please Try again.");
            ContinueCalculator(); // Recursive call
        }
    }
}