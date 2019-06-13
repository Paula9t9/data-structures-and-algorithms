package fifoAnimalShelter;

public class Dog extends Animal {
    public Dog(String fluffiness, String color, int friendliness) {
        super(fluffiness, color, friendliness);
    }

    @Override
    public boolean equals (Object o){

        if(o == this){
            return true;
        }

        if(!(o instanceof Dog)){
            return  false;
        }

        Dog thatDog = (Dog) o;

        if(this.fluffiness == thatDog.fluffiness &&
                this.color == thatDog.color && this.friendliness == thatDog.friendliness){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("\nThis dog is %s, their fluffiness is described as %s, and they have a " +
                "friendliness rating of %d", this.color, this.fluffiness, this.friendliness);
    }
}
