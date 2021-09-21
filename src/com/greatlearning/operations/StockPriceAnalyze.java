package com.greatlearning.operations;

public class StockPriceAnalyze {
	public int count;

	public int priceRise(boolean price[]) {
		count = 0;
		for (int i=0; i < price.length; i++) {
			if (price[i]==true)
				count++;
		}
		return count;
	}
	public int priceFall(boolean [] price) {
		count = 0;
		for (int i = 0; i < price.length; i++) {
			if (price[i]==false)
				count++;
		}
		return count;
	}
}
