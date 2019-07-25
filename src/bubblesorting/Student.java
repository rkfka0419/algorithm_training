package bubblesorting;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	
	private final String name;
	private final int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student that){
		return this.name.compareTo(that.name);
	}
	
	//나이 기준 내림차순
	public static class AgeOrder implements Comparator<Student>{
		public int compare(Student a, Student b){
			if(a.age < b.age) return 1;
			if(a.age > b.age) return -1;
			return 0;
		}
	}
	
	
	public String toString(){
		return name + " : " + age;
	}
	
}
