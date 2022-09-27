package part2;

public class Cat extends Animal{

    private short fluffyTail;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating a " + this.getFood());
    }
}
