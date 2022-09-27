package part2;

public class Dog extends Animal {

    private short degreeOfBarking;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark-bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating a " + this.getFood());
    }
}
