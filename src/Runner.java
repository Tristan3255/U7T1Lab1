import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        /*ArrayList<Cat> Cats = new ArrayList();

        Cat cat1 = new Cat("tails");
        Cat cat2 = new Cat("bob");
        Cat cat3 = new Cat("monka");
        Cat cat4 = new Cat("pepe");
        Cat newCat = new Cat("NOB");

        Cats.add(cat1);
        Cats.add(cat2);
        Cats.add(cat3);
        Cats.add(cat4);

        Cats.set(2, newCat);

        System.out.println(Cats);

        Cats.get(1).setCatName("Archie");

        System.out.println(Cats);

        */

        ArrayList<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
    }
}