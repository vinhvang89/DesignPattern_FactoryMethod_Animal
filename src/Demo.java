public class Demo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("Feline");
        Animal a2 = animalFactory.getAnimal("Canine");
        System.out.println(a1.makeSound());
        System.out.println(a2.makeSound());
    }
}
