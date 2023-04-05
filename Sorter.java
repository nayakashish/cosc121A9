package A9;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {

	
	//IMPROVE PERFORMANCE
	public static void bubbleSort(ArrayList<Patient> list) {
		boolean complete = false;
		
		for(int i = 0; i < list.size() && !complete; i++) {
			complete = true;
			
			for(int curr = 0; curr < list.size()-1-i; curr++) {
				if(list.get(curr).compareTo(list.get(curr+1)) > 0) {
					complete = false;
					Patient temp = list.get(curr+1);
					list.set(curr+1, list.get(curr));
					list.set(curr, temp);
				}
			}

			if(complete) break;
	
		
		
		}
		
	}
	
	
	
	public static void bubbleSort(ArrayList<Patient> list, Comparator<Patient> comp) {
		boolean complete = false;
		
		for(int j = 0; j < list.size() && !complete; j++) {
			for(int curr = 0; curr < list.size()-1-j; curr++) {
				if(comp.compare(list.get(curr), list.get(j)) > 0) {
					complete = false;
					Patient temp = list.get(curr+1);
					list.set(curr+1, list.get(curr));
					list.set(curr, temp);
				
				}
			}
			if (complete) break;
		}
		
		
	} 
	
	
	public static void selectionSort(ArrayList<Patient> list) {
		for(int curr = 0; curr < list.size(); curr++) {
		Patient min = list.get(curr);
		int minIdx = curr;
		
		for(int j = curr; j < list.size(); j++) {
			if(list.get(j).compareTo(min) < 0) {
				min = list.get(j);
				minIdx = j;
				
			}
		}
	
		list.set(minIdx, list.get(curr));
		list.set(curr, min);

		}

	}
	
	
	
	public static void insertionSort(ArrayList<Patient> list) {
		for(int i = 1; i < list.size(); i++) {
			Patient elem = list.get(i);
			
			int pos;
			for(pos = i; pos > 0 && list.get(pos-1).compareTo(elem) > 0; pos--)
				list.set(pos, list.get(pos-1));
			
			list.set(pos, elem);
			
			
		}
	
	}
}
