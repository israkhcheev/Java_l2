public class Lorry extends Car {

    private int loadCapacity;

    public Lorry(String mark, String clazz, String weight, Engine engine, int loadCapacity) {
        super(mark, clazz, weight, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал.");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    void printInfo() {
        System.out.println(
                "Класс: " + this.getClazz() + "\n" +
                        "Марка " + this.getMark() + "\n" +
                        "Вес: " + this.getWeight() + "\n" +
                        "Грузоподъёмность: " + this.loadCapacity + "\n" +
                        "Мотор: " + "\n\t |Мощность: " + this.getEngine().getPower()
                        + "\n\t |Производительность: " + this.getEngine().getEfficiency()
        );
    }
}
