package fifoAnimalShelter;

import stacksAndQueues.Queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnimalShelter {

    private Queue<Cat> catQueue;
    private Queue<Dog> dogQueue;
    //Got map idea from class
    private Map<Animal, Integer> arrivalOrder;
    private int numAnimalsAdded;

    public AnimalShelter(){
        this.catQueue = new Queue<>();
        this.dogQueue = new Queue<>();
        arrivalOrder = new HashMap<>();
        numAnimalsAdded = 0;
    }

    public void donate(Cat cat){
        catQueue.enqueue(cat);
        addAnimal(cat);
    }

    public void donate(Dog dog){
        dogQueue.enqueue(dog);
        addAnimal(dog);
    }

    // Stolen from lecture
    private void addAnimal(Animal a){
        arrivalOrder.put(a, this.numAnimalsAdded);
        numAnimalsAdded++;
    }

    public Cat adoptCat(){
        arrivalOrder.remove(catQueue.peek());
        return (Cat) catQueue.dequeue();
    }

    public Dog adoptDog(){
        arrivalOrder.remove(dogQueue.peek());
        return (Dog) dogQueue.dequeue();
    }

    // Checks which animal was admitted the earliest, and returns that animal for adoption
    public Animal adoptAny(){
        // also stolen from lecture
        if(arrivalOrder.get(dogQueue.peek()) < arrivalOrder.get(catQueue.peek())){
            return dogQueue.dequeue();
        } else {
            return catQueue.dequeue();
        }
    }

    public ArrayList<Animal> getResidents(){
        return new ArrayList<Animal>(arrivalOrder.keySet());
    }
}
