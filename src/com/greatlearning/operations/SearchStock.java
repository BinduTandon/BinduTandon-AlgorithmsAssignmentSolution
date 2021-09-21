package com.greatlearning.operations;

public class SearchStock {

	public void search(double[] array, int stock) {

		for (int i = 0; i < array.length; i++) {
			if (array[i]== stock) {
				System.out.println("Stock value "+stock +" present!!");
				return;
			}
		}
		System.out.println("Value not present!");
	}
}