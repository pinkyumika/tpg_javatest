package tpgproject.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
	
	public static void main (String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Tina", 33, 3.68));
		studentList.add(new Student("Louis", 85, 3.85));
		studentList.add(new Student("Samil", 56, 3.75));
		studentList.add(new Student("Samar", 19, 3.75));
		studentList.add(new Student("Lorry", 22, 3.76));
		
		Collections.sort(studentList, new Comparator<Student>() {
			
			public int compare(Student s1, Student s2) {
				int result;
				result = s2.getGpa().compareTo(s1.getGpa());
				if(result == 0) {
					result = s1.getName().compareTo(s2.getName());
				}
				if(result == 0) {
					result = s1.getId().compareTo(s2.getId());
				}
				return result;
			}
		});
		studentList.stream().forEach(st -> System.out.println(st.getName()));
	}

}
