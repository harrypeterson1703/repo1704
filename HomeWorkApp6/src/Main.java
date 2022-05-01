public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(
                "Мурзик",
                200,
                0
        );
        System.out.println(Animal.getNumOfAnimals());

        Dog dog = new Dog(
                "Бобик",
                500,
                10
        );
        System.out.println(Animal.getNumOfAnimals());

        ActionAnimal[] animals = {cat, dog};
        for (ActionAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(250));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}