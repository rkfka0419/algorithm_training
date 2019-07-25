package bubblesorting;

import java.util.Comparator;

public class GenericBubble {
	
	
	public static <T> void sort(T[] a, Comparator<T> comparator){
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
	private static <T> void exch(T[] a, int i, int j)
	{
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
