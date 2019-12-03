import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Dog dog = new Dog();
    Cat cat = new Cat();

    /*
     *To make the test not be case sensitive all you have to do is convert every
     * string in the assertive statement to lower or upper case,
     * so that the expected and the actual are either all lower or upper.
     */

    @Test
    void TestDogSound() {
    }
    @Test
    void TestDogEats() {

        assertEquals("food".toLowerCase(),dog.eat().toLowerCase(),"Does dog eat Food");
        assertEquals("food".toLowerCase(),dog.eat().toLowerCase(),"Does dog eat food");
    }
    @Test
    void TestCatSound() {
        assertEquals("Barkark".toLowerCase(),cat.sound().toLowerCase(),"Does cat Barkark");
        assertEquals("Meow".toLowerCase(),cat.sound().toLowerCase(),"Does cat Meow");

    }
    @Test
    void TestCatEats() {
        assertEquals("meat".toLowerCase(),cat.eat().toLowerCase(),"Does cat eat meat");
        assertEquals("Food".toLowerCase(),cat.eat().toLowerCase(),"Does cat eat Food");
        assertEquals("food".toLowerCase(),cat.eat().toLowerCase(),"Does cat eat food");
    }
}