public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rax");
        dog.eat();
        dog.sound();

        Cat cat = new Cat();
        cat.setName("Stormy");
        cat.eat();
        cat.sound();

        System.out.println("-------------------");

        Home home = new Home();
        Dog dog1 = new Dog();
        dog1.setName("Rax one");
        Dog dog2 = new Dog();
        dog2.setName("Rax two");

        home.adoptPet(dog1);
        home.adoptPet(dog1);

        home.makeAllSounds();
    }
}