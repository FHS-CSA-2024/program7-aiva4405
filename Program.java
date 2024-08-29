 

//import stuff here
import java.util.Scanner;
//Your code here
public class Program7 {
    public static void main(String[] args) {
        // Create variables for scanner, inputs, output & conversion rate
        Scanner inputScan = new Scanner(System.in);
        int stanleyNickels;
        int klevins;
        int schruteBucks;
        double decimalStanleys;
        double decimalKlevins;
        double outputSchruteBucks;
        final double conversionRate = 100.0 / 240.0;
        
        // Ask for input and store it
        System.out.print("Enter schrute-bucks: ");
        
        schruteBucks = inputScan.nextInt();
        
        System.out.print("\nEnter klevins: ");
        
        klevins = inputScan.nextInt();
        
        System.out.print("\nEnter stanley-nickels: ");
        
        stanleyNickels = inputScan.nextInt();
        
        // Call conversion functions
        decimalStanleys = convertStanleys(stanleyNickels, conversionRate);
        decimalKlevins = convertKlevins(klevins, conversionRate);
        
        // Create output then output it to the user
        outputSchruteBucks = (double)schruteBucks + decimalStanleys + decimalKlevins;
        
        System.out.print("\nNew schrute-bucks: $");
        System.out.format("%.2f", outputSchruteBucks);
    }
    
    public static double convertStanleys(int stanleys, double rate) {
        double newStanleys = stanleys * rate;
        newStanleys /= 100;
        return newStanleys;
    }
    
    public static double convertKlevins(int klevins, double rate) {
        double newKlevins = klevins * 12.0;
        newKlevins *= rate;
        newKlevins /= 100;
        return newKlevins;
    }
}
//Paste console output below:
/*
Enter schrute-bucks: 7

Enter klevins: 17

Enter stanley-nickels: 9

New schrute-bucks: $7.89

*/
