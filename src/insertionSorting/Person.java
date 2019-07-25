package insertionSorting;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	String job;
	
	Person(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public int compareTo(Person that){
		return this.name.compareTo(that.name);
	}
	

	public static class AgeOrder implements Comparator<Person>{
		public int compare(Person a, Person b){
			if(a.age < b.age) return 1;
			if(a.age > b.age) return -1;
			return 0;
		}
	}
	public static class ReverseAgeOrder implements Comparator<Person>{
		public int compare(Person a, Person b){
			if(a.age < b.age) return -1;
			if(a.age > b.age) return 1;
			return 0;
		}
	}
	
	
	
	
	public String  toString(){
		return name + "-직업 : "+job+", 나이 = " + age ;
	}

}
