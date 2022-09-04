package com.codephilosopher.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClassIterableInterface {
	public static void main(String[] args) {
		CollectionClass cc = new CollectionClass();
		Student s1 = new Student();
		s1.setAge(23);
		s1.setName("Anil");
		Student s2 = new Student();
		s2.setAge(32);
		s2.setName("Sunil");
		cc.add(s1);
		cc.add(s2);
		Iterator<Student> si = cc.iterator();
		while (si.hasNext()) {
			Student s = si.next();
			System.out.println(s.getName()+" "+s.getAge());
		}
	}
}


class CollectionClass implements Iterable<Student>{
	private ArrayList<Student> students;
	public CollectionClass() {
		students = new ArrayList<Student>();
	}
	public void add(Student s) {
		students.add(s);
	}
	@Override
	public Iterator<Student> iterator() {
		return students.iterator();
	}
}

class Student {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}




