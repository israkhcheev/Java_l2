package part1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(3.5));
        studentList.add(new Aspirant(5));
        studentList.add(new Student(5));
        studentList.add(new Student(4.9));
        studentList.add(new Aspirant(4.5));
        studentList.add(new Aspirant(2.4));
        studentList.add(new Student(4.7));
        studentList.add(new Student(5));
        studentList.add(new Aspirant(3));
    }

    public static void main(String[] args) {

        for (Student student : studentList) {
            System.out.println("Класс: " + student.getClass().getName()
                    + "\n\tСредний балл: " + student.getAverageMark()
                    + "\n\tСумма стипендии: " + student.getScholarship());
        }
    }

}
