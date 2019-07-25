package mergesorting;

public class Merge{
	public static void merge(Comparable a[], int low, int mid, int high, Comparable b[]){
		int i = low;
		int j = mid+1;
		int k = high;
		while(k<=high)
		{
			if( i > mid) b[k++] = a[j++];
			else if( j > high) b[k++] = a[i++];
			else if(a[i].compareTo(a[j]) > 0) b[k++] = a[j++];
			else b[k++] = a[i++];
		}
		for(k = low; k < high; k++)
		{
			b[k] = a[k];
		}
	}
	

	public static void sort(Comparable a[], int low, int high, Comparable b[]){
		if(low >= high) return;
		int mid = (low + high)/2;
		sort(a, low, mid, b);
		sort(a, mid+1, high, b);
		merge(a, low, mid, high, b);
	}
	
	
	public static void sort(Comparable a[]){
		Comparable[] b = new Comparable[a.length];
		sort(a, 0, a.length-1, b);
	}

}
