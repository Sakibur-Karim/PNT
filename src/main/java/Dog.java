public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating Roti");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping after eating");

    }
}
