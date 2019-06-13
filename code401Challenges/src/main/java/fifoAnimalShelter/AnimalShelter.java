package fifoAnimalShelter;

import stacksAndQueues.Queue;

import java.util.ArrayList;
import java.util.Map;

public class AnimalShelter {

    private Queue<Cat> catQueue;
    private Queue<Dog> dogQueue;
    //Got map idea from class
    private Map<Animal, Integer> arrivalOrder;

    public AnimalShelter(){
        this.catQueue = new Queue<>();
        this.dogQueue = new Queue<>();
    }

    public void donate(Cat cat){
        catQueue.enqueue(cat);
    }

    public void donate(Dog dog){
        dogQueue.enqueue(dog);
    }
//
//    public Cat adoptCat(){
//        return (Cat) catQueue.remove();
//    }
//
//    public Dog adoptDog(){
//        return (Dog) dogQueue.remove();
//    }
//
//    public Animal adoptAny(){
//        return new Cat("default", "default", 10);
//    }
//
//    public ArrayList<Animal> getResidents(){
//        return new ArrayList<>();
//    }
}
