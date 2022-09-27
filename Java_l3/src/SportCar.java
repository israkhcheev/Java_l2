public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String mark, String clazz, String weight, Engine engine, int maxSpeed) {
        super(mark, clazz, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("SportCar ������");
    }

    @Override
    void stop() {
        System.out.println("SportCar �����������");
    }

    @Override
    void printInfo() {
        System.out.println(
                "����� " + this.getClazz() + "\n" +
                        "����� " + this.getMark() + "\n" +
                        "���: " + this.getWeight() + "\n" +
                        "������������ ��������: " + this.maxSpeed + "\n" +
                        "�����: " + "\n\t |��������: " + this.getEngine().getPower()
                        + "\n\t |������������������: " + this.getEngine().getEfficiency()
        );
    }
}
