package fifoAnimalShelter;

import java.util.Objects;

public class Cat extends Animal {

    public Cat(String fluffiness, String color, int friendliness) {
        super(fluffiness, color, friendliness);
    }

    @Override
    public boolean equals (Object o){

        if(o == this){
            return true;
        }

        if(!(o instanceof Cat)){
            return  false;
        }

        Cat thatCat = (Cat) o;

        if(this.fluffiness == thatCat.fluffiness &&
            this.color == thatCat.color && this.friendliness == thatCat.friendliness){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("\nThis cat is %s, their fluffiness is described as %s, and they have a " +
                "friendliness rating of %d", this.color, this.fluffiness, this.friendliness);
    }
}
