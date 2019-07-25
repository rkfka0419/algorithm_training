package insertionSorting;

import java.util.Comparator;

public class GenericInsertion {
		
	public static <T> void sort(T a[], Comparator<T> comparator){
		int n = a.length;
		int j=0;
		T key;
		for(int i=0;i<n;i++){
			key = a[i];
			j = i-1;
			
			while(j>= 0 && comparator.compare(a[j], key) > 0){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;			
		}
		
	}
	
}
