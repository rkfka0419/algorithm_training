package insertionSorting;

public class InsertionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p[] = new Person[3];
		p[0] = new Person("Garam", 25, "Student");
		p[1] = new Person("Jaehyung", 31, "Photographer");
		p[2] = new Person("Sangwuk", 23, "Programmer");
		
		//나이순 정렬
		GenericInsertion.sort(p, new Person.ReverseAgeOrder());
		
		for(Person s : p)
			System.out.println(s);

	}

}
