package org.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;

    // Конструктор без параметрів
    public Student() {
        this.name = "Default Name";
        this.age = 25;
        this.studentId = "000000";
        this.gpa = 0.0;
    }

    // Конструктор з параметрами
    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    // Сеттери
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Метод для відображення інформації про студента
    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentId + ", GPA: " + gpa);
    }
}

// Головний клас для тестування
class StudentMain {

    public static void main(String[] args) {

        // Створюємо ArrayList для зберігання студентів
        ArrayList<Student> students = new ArrayList<>();

        // Додаємо 10 студентів з різними даними
        students.add(new Student("John Doe", 20, "S001", 3.8));
        students.add(new Student("Jane Smith", 19, "S002", 3.5));
        students.add(new Student("Alex Johnson", 21, "S003", 3.9));
        students.add(new Student("Emily Davis", 22, "S004", 3.6));
        students.add(new Student("Michael Brown", 20, "S005", 3.7));
        students.add(new Student("Sarah Wilson", 18, "S006", 3.4));
        students.add(new Student("David Clark", 23, "S007", 3.2));
        students.add(new Student("Emma Miller", 21, "S008", 3.9));
        students.add(new Student("James Taylor", 19, "S009", 3.3));
        students.add(new Student("Sophia Anderson", 20, "S010", 4.0));

        // Знаходимо студента з найвищим GPA
        double maxGpa = 0.0;
        Student topStudent = null;

        System.out.println("All Students:");
        for (Student student : students) {
            if (student.getGpa() > maxGpa) {
                maxGpa = student.getGpa();
                topStudent = student;
            }
        }

        // Вывод студента с максимальным GPA
        System.out.println("\nStudent with the highest GPA:");
        if (topStudent != null) {
            topStudent.displayStudentInfo();
        }

        // Знаходимо студента за ID
        String searchId = "S005"; // ID, який шукаєм
        Student foundStudent = null;

        for (Student student : students) {
            if (student.getStudentId().equals(searchId)) {
                foundStudent = student;
                break; // Зупиняємо цикл, якщо студент знайдений
            }
        }

        System.out.println("\nStudent with ID " + searchId + ":");
        if (foundStudent != null) {
            foundStudent.displayStudentInfo();
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // Демонстрация использования конструкторов и сеттеров
        System.out.println("\nAdditional Students:");
        Student student1 = new Student();
        student1.displayStudentInfo();

        Student student2 = new Student("Dana", 20, "D199408", 5.7);
        student2.displayStudentInfo();

        student1.setName("Antony");
        student1.setAge(22);
        student1.setStudentId("A032002");
        student1.setGpa(8.9);

        System.out.println("\nUpdated Student Info:");
        student1.displayStudentInfo();

        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Age: " + student2.getAge());
        System.out.println("Student ID: " + student2.getStudentId());
        System.out.println("Student GPA: " + student2.getGpa());
    }
}
