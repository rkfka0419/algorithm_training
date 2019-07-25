package bubblesorting;

import java.util.Comparator;

public class Bubble {
	public static void sort(Comparable[] a){
		int n=a.length;
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j].compareTo(a[j+1]) > 0)
					exch(a, j, j+1);
			}
		}
	}
	
	public static void sort(Object[] a, Comparator comparator){
		int n=a.length;
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(comparator.compare(a[j], a[j+1]) > 0)
					exch(a, j, j+1);
			}
		}
		
	}
	
	
	//helper method : 배열 내의 두 원소를 교환하기
	private static void exch(Object[] a, int i, int j)
	{
		Object tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
