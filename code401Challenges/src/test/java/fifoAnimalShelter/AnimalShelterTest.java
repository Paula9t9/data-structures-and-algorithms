package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter testAnimalShelter;
    ArrayList<Animal> expectedAnimals;

    @Before
    public void setUp() {
        testAnimalShelter = new AnimalShelter();
        testAnimalShelter.donate(new Cat("Super fluffy", "white", 2));
        testAnimalShelter.donate(new Dog("Pretty fluffy", "brown", 9));
        testAnimalShelter.donate(new Cat("Hairless", "skin", 10));
        testAnimalShelter.donate(new Cat("Medium fluff", "tabby", 6));
        testAnimalShelter.donate(new Dog("Uber fluff", "white", 11));
        testAnimalShelter.donate(new Dog("Little bit fluff", "black", 3));
        testAnimalShelter.donate(new Dog("Gruffy fluff", "brown", 7));

        expectedAnimals = new ArrayList<>();
        expectedAnimals.add(new Cat("Super fluffy", "white", 2));
        expectedAnimals.add(new Dog("Pretty fluffy", "brown", 9));
        expectedAnimals.add(new Cat("Hairless", "skin", 10));
        expectedAnimals.add(new Cat("Medium fluff", "tabby", 6));
        expectedAnimals.add(new Dog("Uber fluff", "white", 11));
        expectedAnimals.add(new Dog("Little bit fluff", "black", 3));
        expectedAnimals.add(new Dog("Gruffy fluff", "brown", 7));

    }

    @Test
    public void testGetDog_basic(){
        assertTrue("Should get back a dog", testAnimalShelter.adoptDog() instanceof Dog);
    }

    @Test
    public void testGetCat_basic(){
        assertTrue("Should get back a cat", testAnimalShelter.adoptCat() instanceof Cat);
    }

    @Test
    public void testGetAny_basic(){
        assertTrue("Should get back the first animal added", testAnimalShelter.adoptAny() instanceof Cat);
    }

    @Test
    public void testEnqueue_basic(){
        assertEquals("Should contain all of the added animals",
                expectedAnimals, testAnimalShelter.getResidents());
    }

    @Test
    public void testDequeue_basic(){

        expectedAnimals.remove(0);
        testAnimalShelter.adoptAny();

        assertEquals("Should have removed the first donated animal",
                expectedAnimals, testAnimalShelter.getResidents());
    }

    @Test
    public void testDequeue_multiple(){

        expectedAnimals.remove(0);
        expectedAnimals.remove(0);
        expectedAnimals.remove(0);
        testAnimalShelter.adoptAny();
        testAnimalShelter.adoptAny();
        testAnimalShelter.adoptAny();

        assertEquals("Should have removed the first donated animal",
                expectedAnimals, testAnimalShelter.getResidents());
    }

    @Test
    public void testDequeue_dog(){

        expectedAnimals.remove(1);
        testAnimalShelter.adoptDog();

        assertEquals("Should have removed the first donated dog",
                expectedAnimals, testAnimalShelter.getResidents());
    }

    @Test
    public void testDequeue_cat(){

        expectedAnimals.remove(0);
        testAnimalShelter.adoptCat();

        assertEquals("Should have removed the first donated cat",
                expectedAnimals, testAnimalShelter.getResidents());
    }

    @Test
    public void testEquals_cat(){

        Cat testCat = new Cat("Fluffy", "brown", 5);
        Cat testCat2 = new Cat("Fluffy", "brown", 5);
        Dog testDog = new Dog("Fluffy", "brown", 5);

        assertEquals("Cat should equal itself", testCat, testCat);
        assertEquals("Cat should equal a cat with the same values", testCat, testCat2);
        assertNotEquals("Cat should not equal a dog with the same values", testCat, testDog);
    }

    @Test
    public void testEquals_dog(){

        Dog testDog = new Dog("Fluffy", "brown", 5);
        Dog testDog2 = new Dog("Fluffy", "brown", 5);
        Cat testCat = new Cat("Fluffy", "brown", 5);

        assertEquals("Dog should equal itself", testDog, testDog);
        assertEquals("Dog should equal a dog with the same values", testDog, testDog2);
        assertNotEquals("Dog should not equal a cat with the same values", testDog, testCat);
    }

    @Test
    public void testEquals_animal(){

        Animal testAnimal = new Animal("Fluffy", "brown", 5);
        Animal testAnimal2 = new Animal("Fluffy", "brown", 5);

        assertEquals("Animal should equal itself", testAnimal, testAnimal);
        assertEquals("Animal should equal an animal with the same values", testAnimal, testAnimal2);
    }

}