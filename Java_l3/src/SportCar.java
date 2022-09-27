public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String mark, String clazz, String weight, Engine engine, int maxSpeed) {
        super(mark, clazz, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    void printInfo() {
        System.out.println(
                "Класс " + this.getClazz() + "\n" +
                        "Марка " + this.getMark() + "\n" +
                        "Вес: " + this.getWeight() + "\n" +
                        "Максимальная скорость: " + this.maxSpeed + "\n" +
                        "Мотор: " + "\n\t |Мощность: " + this.getEngine().getPower()
                        + "\n\t |Производительность: " + this.getEngine().getEfficiency()
        );
    }
}
