package part2;

public class Horse extends Animal {

    private short runningSpeed;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh Neigh!");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating a " + this.getFood());
    }
}
