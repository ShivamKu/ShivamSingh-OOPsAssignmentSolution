package com.greatLearning.dsaAlgorithm.labSession.services;

public class CountTheNotes {
	int notesCount[];
	int index;
	int rem;
	int[] notes;
	
	
	public void minimumNotes(int arr[],int amount) {
		index=0;
		notesCount = new int[arr.length];
		notes = new int[arr.length];
		if(amount==0) {
			return;
		}
		try {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<=amount) {
				notesCount[index]=amount/arr[i];
				notes[index]=arr[i];
				index++;
				amount=amount%arr[i]; 
			}
			else {
				continue;
			}
			
		}
		
		if (amount>0) {
			System.out.println("Exact amount cannot be given with the highest denominator or with Minimum number of Notes");
			return;
		}
		else{
			System.out.println("Your Payment approach in order to give min no of notes will be");
			printValues(notesCount,notes);
		}
		
	}catch(ArithmeticException e) {
		System.out.println("Notes with Denomination 0 value is Invalid");
	}
	}
	public void printValues(int[] notesCount, int[] notes) {
		for(int i=0;i<notes.length;i++) {
			if(notesCount[i] != 0) {
				System.out.println(notes[i]+" : "+notesCount[i]);
			}
			
			
			   
		}
			
	}

}
