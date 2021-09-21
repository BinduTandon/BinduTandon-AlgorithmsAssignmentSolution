package com.greatlearning.company;
import java.util.Scanner;

import com.greatlearning.operations.AscendingSort;
import com.greatlearning.operations.DescendingSort;
import com.greatlearning.operations.SearchStock;
import com.greatlearning.operations.StockPriceAnalyze;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int No_of_companies;
		double array[];
		boolean price[];
		System.out.println("Enter the no of companies :");
		No_of_companies = sc.nextInt();
		array = new double [No_of_companies];
		price = new boolean[No_of_companies];
		for (int i = 0; i < No_of_companies; i++) {
			System.out.println("Enter current stock price of the company "+ (i+1));
			array[i]= sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			price[i] = sc.nextBoolean();
		}
		int choice=0;
		AscendingSort ascsort = new AscendingSort();
		DescendingSort descsort = new DescendingSort();
		StockPriceAnalyze stockanalyze = new StockPriceAnalyze();
		SearchStock searching = new SearchStock();
		do {
			System.out.println("-----------------------------------------------");
			System.out.println();
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1.Display the companies stock prices in ascending order\n2.Display the companies stock prices in descending order\n"
					+ "3.Display the total no of companies for which stock prices rose today\n4.Display the total no of companies for which stock prices declined today\n"
					+ "5.Search a specific stock price\n6.Press 6 to exit");
			System.out.println();
			System.out.println("-----------------------------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ascsort.sortArray(array, 0, array.length-1);
				ascsort.printValues();
			break;
			case 2:
				descsort.sortArray(array, 0, array.length-1);
				descsort.printValues();
			break;
			case 3:
				stockanalyze.priceRise(price);
				System.out.println("Total no of companies whose stock price rose today :"+stockanalyze.count);
			break;
			case 4:
				stockanalyze.priceFall(price);
				System.out.println("Total no of companies whose stock price declined today :" +stockanalyze.count);
			break;
			case 5:
				System.out.println("Enter the stock value to check : ");
				int stock = sc.nextInt();
				searching.search(array, stock);
			break;	
			case 6:
				System.out.println("Exited successfully ");
				return;
				
			default:
				System.out.println("Please give a valid no. ");
			}
			
		}while (choice != 6);
		sc.close();
	}

}
