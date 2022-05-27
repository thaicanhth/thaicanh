package buoi02;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> students = new ArrayList<>();

    public StudentList() {
        Student stu01 = new Student("111", "A Nguyen", 9.5);
        Student stu02 = new Student("222", "B Nguyen", 5.3);
        Student stu03 = new Student("333", "C Nguyen", 7.5);
        Student stu04 = new Student("444", "D Nguyen", 8.3);
        Student stu05 = new Student("555", "E Nguyen", 4.3);
        students.add(stu01);
        students.add(stu02);
        students.add(stu03);
        students.add(stu04);
        students.add(stu05);
    }

    public void create() {
        String i;
        String f;
        double g;
        Main.in.nextLine();
        System.out.print("Enter Id= ");
        i = Main.in.nextLine();
        System.out.print("Enter Name = ");
        f = Main.in.nextLine();
        System.out.print("Enter grade = ");
        g = Main.in.nextDouble();
        Student tmp = new Student(i, f, g);
        students.add(tmp);
    }

    public void display() {
        for (Student stuPointer : students) {
            System.out.println("" + stuPointer);
        }
    }

    public void remove() {
        System.out.println("Enter index to remove: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("Ok, we will remove the " + index + " student");
            students.remove(index);
            display();
        }
    }

    public void update() {
        System.out.println("Enter index to update: ");
        int index = Main.in.nextInt();
        if (index < students.size()) {
            System.out.println("Ok, we will UPDATE the " + index + " student");
            Student tempStudent = new Student("AAA", "B Le", 9.3);
            students.set(index, tempStudent);
            display();
        }
    }
}
