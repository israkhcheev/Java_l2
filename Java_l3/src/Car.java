public abstract class Car {

    private String mark;
    private String clazz;
    private String weight;
    private Engine engine;

    public Car(String mark, String clazz, String weight, Engine engine) {
        this.mark = mark;
        this.clazz = clazz;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();

    abstract void stop();

    abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getMark() {
        return mark;
    }

    public String getClazz() {
        return clazz;
    }

    public String getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }
}
