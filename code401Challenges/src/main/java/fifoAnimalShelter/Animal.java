package fifoAnimalShelter;

public class Animal {

    String fluffiness;
    String color;
    int friendliness;

    public Animal (String fluffiness, String color, int friendliness ){

        this.fluffiness = fluffiness;
        this.color = color;
        this.friendliness = friendliness;
    }

    @Override
    public boolean equals (Object o){

        if(o == this){
            return true;
        }

        if(!(o instanceof Animal)){
            return  false;
        }

        Animal thatAnimal = (Animal) o;

        if(this.fluffiness == thatAnimal.fluffiness &&
                this.color == thatAnimal.color && this.friendliness == thatAnimal.friendliness){
            return true;
        }else {
            return false;
        }
    }
}
