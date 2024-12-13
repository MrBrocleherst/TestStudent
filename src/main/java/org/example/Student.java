package org.example;

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
class main {
    public static void main(String[] args) {
// Створення об'єктів класу Student

        // Використання конструктора без параметрів
        Student student1 = new Student();
        student1.displayStudentInfo();

        // Використання конструктора з параметрами
        Student student2 = new Student("Dana", 20, "D199408", 5.7);
        student2.displayStudentInfo();

        // Використання сеттерів для оновлення інформації
        student1.setName("Edem");
        student1.setAge(31);
        student1.setStudentId("E311993");
        student1.setGpa(8.9);

        // Виведення оновленої інформації
        student1.displayStudentInfo();

        // Використання геттерів для отримання окремих значень
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student GPA: " + student2.getGpa());
    }
}
