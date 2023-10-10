package ch10_Object_Oriented_Programming_Polymorphism_and_Interfaces;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Öğrencileri ID'ye göre karşılaştır
        return Integer.compare(this.id, otherStudent.id);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 101));
        studentList.add(new Student("Bob", 102));
        studentList.add(new Student("Charlie", 100));

        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student.getName() + " - " + student.getId());
        }
    }
}
