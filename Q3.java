package A9;

import java.util.ArrayList;

public class Q3 {
	

	public static void main(String[] args) {
		
		//Print title for table
		System.out.println("    N        Bubble      Selection      Insertion");
		
		//enter loop that increases list by 5000 everytime.
		for(int i = 5000; i <= 50000; i += 5000) {
			ArrayList<Patient> bubble = new ArrayList<Patient>(i);

			//fill list with random elements
			for(int j = 0; j < i; j++)
				bubble.add(randomPatient(i));

			//create three identical lists by cloning.
			ArrayList<Patient> select = new ArrayList<Patient>(bubble);
			ArrayList<Patient> insert = new ArrayList<Patient>(bubble);
			
			//print out list size (left column)
			System.out.printf("%5d", i);
			
			long startTime, endTime;
			
			//enter loop to sort 3 lists
			for(int k = 0; k < 3; k++) {
				switch(k) {
				
				case 0: // bubbleSort
					startTime = System.currentTimeMillis();
					
					Sorter.bubbleSort(bubble);
					
					endTime = System.currentTimeMillis();
					System.out.printf("%14.3f", (double) (endTime - startTime) / 1000);
					break;
					
				case 1: //selectionSort
					startTime = System.currentTimeMillis();
					
					Sorter.selectionSort(select);
					
					endTime = System.currentTimeMillis();
					System.out.printf("%15.3f", (double) (endTime - startTime) / 1000);
					break;
					
				case 2: //insertionSort
					startTime = System.currentTimeMillis();
					
					Sorter.insertionSort(insert);
					
					endTime = System.currentTimeMillis();
					System.out.printf("%15.3f\n", (double) (endTime - startTime) / 1000);
					break;
				
				}
				
			}
		}

		
		System.out.println("\nSorted All Lists.");
	}
	
	public static Patient randomPatient(int n) {
		//Random ID
		int id = (int) Math.round(Math.random() * n);
		
		//Random true/false
		boolean emergency = Math.round(Math.random()) == 1 ? true : false;
		
		//return random patient
		return new Patient(5, "Michael", emergency);
		
	}
	
	

}
