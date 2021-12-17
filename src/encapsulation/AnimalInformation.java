package encapsulation;

public class AnimalInformation {
    public static void main(String[] args) {

        Animal deer = new Animal();

        deer.setName("Deer");
        deer.setColor("Brown");
        deer.setEat("Yonca");
        deer.setLegs(4);


        System.out.println(deer.getName() + " " + deer.getColor() + " " + deer.getEat() + " " + deer.getLegs());







    }
}
