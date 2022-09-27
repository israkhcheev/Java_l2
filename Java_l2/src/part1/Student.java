package part1;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public short getScholarship() {
        if (this.averageMark == 5) return 100;
        return 80;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}