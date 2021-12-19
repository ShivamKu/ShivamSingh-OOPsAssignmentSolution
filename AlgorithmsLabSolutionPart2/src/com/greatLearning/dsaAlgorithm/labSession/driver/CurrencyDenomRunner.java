package com.greatLearning.dsaAlgorithm.labSession.driver;

import com.greatLearning.dsaAlgorithm.labSession.services.MergeSortImplementation;
import com.greatLearning.dsaAlgorithm.labSession.services.CountTheNotes;

import java.util.*;
public class CurrencyDenomRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int size;
		int amountToPay;
		
		System.out.println("Enter the size of Currency Denomination:");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		arr = new int[size];
		
		System.out.println("Enter the Currency Denomination of Value:");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to Pay:");
		amountToPay =  sc.nextInt();
		
		MergeSortImplementation mergeSort = new MergeSortImplementation();
		
		mergeSort.sort(arr,0,size-1);
		
		CountTheNotes minNotes = new CountTheNotes();
		
		
		
		minNotes.minimumNotes(arr,amountToPay);
		
		sc.close();

	}

}
