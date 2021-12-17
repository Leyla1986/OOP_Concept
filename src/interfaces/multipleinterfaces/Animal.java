package interfaces.multipleinterfaces;


public class Animal implements Monkey,Rabbit {


    @Override
    public void monkeyMethod() {
        System.out.println("Banana");
    }

    @Override
    public void jump() {
        System.out.println("Hop Hop");
    }
}

