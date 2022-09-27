public class Lorry extends Car {

    private int loadCapacity;

    public Lorry(String mark, String clazz, String weight, Engine engine, int loadCapacity) {
        super(mark, clazz, weight, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void start() {
        System.out.println("�������� ������.");
    }

    @Override
    void stop() {
        System.out.println("�������� �����������.");
    }

    @Override
    void printInfo() {
        System.out.println(
                "�����: " + this.getClazz() + "\n" +
                        "����� " + this.getMark() + "\n" +
                        "���: " + this.getWeight() + "\n" +
                        "����������������: " + this.loadCapacity + "\n" +
                        "�����: " + "\n\t |��������: " + this.getEngine().getPower()
                        + "\n\t |������������������: " + this.getEngine().getEfficiency()
        );
    }
}
