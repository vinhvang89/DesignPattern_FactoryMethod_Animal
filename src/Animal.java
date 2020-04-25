public abstract class Animal {
    public abstract String makeSound();
}
class Dog extends Animal{
    @Override
    public String makeSound() {
        return "Behold the wolf fury";
    }
}
class Cat extends Animal{
    @Override
    public String makeSound() {
        return "I am a cat burglar";
    }
}
class AnimalFactory{
    public Animal getAnimal(String type){
        if("Canine".equals(type))
            return new Dog();
        else
            return new Cat();
    }
}