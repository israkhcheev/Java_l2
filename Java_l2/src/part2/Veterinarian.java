package part2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.getFood()
                + " location: " + animal.getLocation());
    }

}
