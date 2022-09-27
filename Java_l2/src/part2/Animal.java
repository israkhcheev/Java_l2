package part2;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Some animal is making noise");
    }

    public void eat() {
        System.out.println("Some animal is eating");
    }

    public void sleep() {
        System.out.println("Some animal is sleeping");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
