package part1;

public class Aspirant extends Student {

    private String nameOfScienceWork;

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public short getScholarship() {
        if (this.getAverageMark() == 5) return 200;
        return 180;
    }
}
