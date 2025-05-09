public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            System.out.println(animal.MakeSound());
        }
    }
}
