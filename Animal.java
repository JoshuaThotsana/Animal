class Animal {

    private String name;

    void setName(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("sound...");
    }
    void eat() {
        System.out.println(name+" eats.");
    }
}
