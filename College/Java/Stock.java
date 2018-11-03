/**
  **Stock sale program
  **Date: Sept 16 2018
  **my first assignment in java
  */
import java.util.Scanner; 
public class Stock{
	
	/*Declaring the main method*/
	public static void main(String[] args){
		
		//declaring and initializing variables
		double valueShares = 0;
		double commission =	 0;
		double netProceeds = 0;
		double stockPrice = 0;
		double numShares = 0;
		double commissionRate= 0;
		
		Scanner input = new Scanner(System.in);
		//prompt
		System.out.println("This program calculates the net proceeds from a sale of stock.");
		System.out.println(" ");
		
		//ask the users and put the answer in the variable
		System.out.println("Enter the stock price:$");
		stockPrice = input.nextDouble();
	
		//ask the users and put the answer in the variable
		System.out.println("Enter the number of shares to be sold:");
		numShares = input.nextDouble();
	
	    //ask the users and put the answer in the variable
		System.out.println("Enter the commission rate(as a percentage):");
		commissionRate = input.nextDouble();
		
		//user the value that users give and calculating
		valueShares = stockPrice * numShares;
		commission = valueShares * (commissionRate /100);
		netProceeds = valueShares - commission;
		
		//Display the result
		System.out.printf("Value of shares: " + valueShares);
		System.out.println("Commission: " + commission);
		System.out.println("Net proceeds: " + netProceeds);
	}
}
