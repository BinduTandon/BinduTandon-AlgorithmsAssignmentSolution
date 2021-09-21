package com.greatlearning.operations;

public class AscendingSort {
	double array[];
	public void sortArray(double [] array, int left,int right ) {
		this.array = array;
		if (left<right) {
			int mid = (left+right)/2;
			sortArray(array, left, mid);
			sortArray(array, mid+1, right);
			conquerArray(array, left,mid, right);
		}

	}	
	public void conquerArray(double [] array, int left, int mid, int right) {
		int length1 = mid-left+1;
		int length2= right - mid;

		double  leftarray[] = new double [length1];
		double  rightarray[] = new double [length2];

		for (int i=0; i<length1; i++) {
			leftarray[i]=array[left+i];
		}
		for (int j = 0; j<length2; j++) {
			rightarray[j]= array[mid+1+j];
		}
		int i=0; 
		int j= 0;
		int key = left;
		while (i<length1&& j<length2) {
			if(leftarray[i]<=rightarray[j]) {
				array[key]= leftarray[i];
				i++;
			}else {
				array[key]= rightarray[j];
				j++;
			}
			key++;
		}
		while(i<length1) {
			array[key]= leftarray[i];
			i++;
			key++;
		}
		while(j<length2) {
			array[key]= rightarray[j];
			j++;
			key++;
		}
	}
	public void printValues() {
		System.out.println("Stock prices in ascending order are ");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
}
