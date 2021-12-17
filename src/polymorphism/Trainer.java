package polymorphism;

public class Trainer {
    public static void main(String[] args) {


        Animal dog = new Dog();
        dog.action();

        Animal bird = new Bird();
        bird.action();

        Animal fish  = new Fish();
        fish.action();




    }

}
