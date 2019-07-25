package bubblesorting;

public class GenericBubbleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] sts = new Student[3];
		sts[0] =new Student("ykk", 25);
		sts[1] =new Student("abc", 21);
		sts[2] =new Student("spring", 10);
		
		GenericBubble.sort(sts, new Student.AgeOrder());
		for(Student s : sts)
			System.out.println(s);

	}

}
