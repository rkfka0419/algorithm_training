package mergesorting;

public class MergeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {1,3,5,7,2,4,6,8};
		Integer b[] = new Integer[a.length];
		
		Merge.merge(a, 0, 3, 7, b);
		
		for(Integer x :a)
			System.out.println(x);

	}

}
