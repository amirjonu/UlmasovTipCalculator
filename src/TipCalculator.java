import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("-----------Welcome to the Tip Calculator-----------");

        //Welcomes and asks for total bill and user inputs the total amount
        System.out.print("Enter the total bill amount: $ ");
        double totalBill= input.nextDouble();

        //Asks for tip percentage and user enters it
        System.out.print("Enter the tip percentage: %");
        int tipPercentage= input.nextInt();

        //Asks for total number of people and user enters it
        System.out.print("Enter the total amount of people in your party: ");
        int totalPeople= input.nextInt();

        //This calculates the total tip amount
        double totalTip= totalBill*((double)tipPercentage/100);
        System.out.println();
        System.out.println("The total tip amount is: $"+ String.format("%.2f", totalTip));

        //This calculates the total bill including tip
        double totalMoney= totalBill+ totalTip;
        System.out.println("The total amount of money including the bill and tip is: $"+ String.format("%.2f", totalMoney));

        //This calculates the tip per person
        double tipPerPerson= totalTip/totalPeople;
        System.out.println("The tip amount per person is: $"+ String.format("%.2f", tipPerPerson));

        //This calculates the total amount of money per person
        double totalPerPerson= totalMoney/totalPeople;
        System.out.println("The total amount of money per person is: $"+ String.format("%.2f", totalPerPerson));



    }
}
