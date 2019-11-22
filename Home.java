import java.util.Arrays;

class Home {

    private Animal[] myAnimals = new Animal[0];

    void adoptPet(Animal pet){

        for (Animal myAnimal : myAnimals) {
            if (myAnimal == pet) {
                System.out.println(pet.getClass().getName()+" "+"already adopted.");
                return;
            }
        }

        myAnimals = Arrays.copyOf(myAnimals,myAnimals.length+1);
        myAnimals[myAnimals.length-1] = pet;
    }

    void makeAllSounds(){
        for (Animal myAnimal : myAnimals) {
            myAnimal.sound();
        }
    }
}
