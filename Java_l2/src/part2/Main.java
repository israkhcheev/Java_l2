package part2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Animal> animals = new ArrayList<>();

    static {
        animals.add(new Cat("Catnip", "Russia"));
        animals.add(new Dog("Bone", "France"));
        animals.add(new Cat("Hay", "Germany"));
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
        animals.get(1).makeNoise();
    }

}
