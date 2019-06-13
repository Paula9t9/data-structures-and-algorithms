package fifoAnimalShelter;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

public class AnimalShelter {

    private Queue<Cat> catQueue;
    private Queue<Dog> dogQueue;
    //Got map idea from class
    private Map<Animal, Integer> arrivalOrder;

    public AnimalShelter(){
        this.catQueue = new Queue<>();
    }

    public void donate(Cat cat){
        catQueue.add(cat);
    }

    public void donate(Dog dog){
        dogQueue.add(dog);
    }

    public Cat adoptCat(){
        return (Cat) catQueue.remove();
    }

    public Dog adoptDog(){
        return (Dog) dogQueue.remove();
    }

    public Animal adoptAny(){
        return new Cat("default", "default", 10);
    }

    public ArrayList<Animal> getResidents(){
        return new ArrayList<>();
    }
}
