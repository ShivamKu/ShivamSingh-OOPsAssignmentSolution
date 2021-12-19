package com.greatLearning.dsaAlgorithm.labSession.service;

import java.util.*;

public class PayMoneyTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Transaction array");
		int size = sc.nextInt();
		 
		int[] transactionArr = new int[size];
		System.out.println("Enter the Values of Array");
		for(int i=0;i<size;i++) 
			transactionArr[i]=sc.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		
		 
		while(targetNo--!=0) {
			int flag=0;
			long target;
			System.out.println("\nEnter the value of target");
			target = sc.nextInt();
			long sum=0;
			for(int i=0;i<size;i++) {
				sum+=transactionArr[i];
				
				if(sum>=target) {
					sum+=transactionArr[i];
					
					if(sum>=target) {
						System.out.println("Target achieved after " +(i+1) +" transactions \n");
						flag=1;
						break;
					}
				}
				
			}
			
			if (flag==0) {
				System.out.println("Given target is not achieved");
			
		}
		
		}
		
		sc.close();

	}

}
