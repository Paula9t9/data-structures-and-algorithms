package fifoAnimalShelter;

import java.util.ArrayList;

public class AnimalShelter {

    public void donate(Cat cat){}

    public void donate(Dog cat){}

    public Cat adoptCat(){
        return new Cat("default", "default", 10);
    }

    public Dog adoptDog(){
        return new Dog("default", "default", 10);
    }

    public Animal adoptAny(){
        return new Cat("default", "default", 10);
    }

    public ArrayList<Animal> getResidents(){
        return new ArrayList<>();
    }
}
