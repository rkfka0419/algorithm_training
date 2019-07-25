package bubblesorting;

import java.util.Comparator;
class ReverseOrder implements Comparator<Integer> {
	public int compare(Integer v1, Integer v2){
		return -v1.compareTo(v2);
	}
	
}
public class BubbleTest {

	public static void main(String[] args) {
		Integer[] m = {5,2,9,4,7};
		Bubble.sort(m);
		for(Integer x:m)
			System.out.println(x);
		Bubble.sort(m, new ReverseOrder());
		for(Integer x:m)
			System.out.println(x);
		
		Double[] rnd = new Double[5];
		for(int i=0;i<rnd.length;i++)
			rnd[i] = Math.random();
		Bubble.sort(rnd);
		for(Double d:rnd)
			System.out.println(d);
		
		String[] shapes = {"triangle", "circle", "Square" };
		Bubble.sort(shapes);
		for(String s:shapes)
			System.out.println(s);
		Bubble.sort(shapes, String.CASE_INSENSITIVE_ORDER);
		for(String s:shapes)
			System.out.println(s);
		
		Student[] sts = new Student[3];
		sts[0] =new Student("ykk", 25);
		sts[1] =new Student("abc", 21);
		sts[2] =new Student("spring", 10);
		
		Bubble.sort(sts);
		for(Student s : sts)
			System.out.println(s);
		
		Bubble.sort(sts, new Student.AgeOrder());

		System.out.println("======");
		for(Student s : sts)
			System.out.println(s);
		
	}

}
