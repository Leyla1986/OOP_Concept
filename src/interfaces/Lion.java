package interfaces;

public class Lion implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Roooor");
    }

    @Override
    public void sleep() {
        System.out.println("XXX");
    }
}
