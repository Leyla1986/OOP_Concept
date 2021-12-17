package inheritance.season;

public class Summer extends Season {


    public static void main(String[] args) {
        Season obj = new Season("Summer" , 75,25);
        System.out.println(obj.toString());
        System.out.println(obj.activity("Drink Lemonade"));
    }
    public Summer(String name, int highestAverage, int lowestAverage) {
        super(name, highestAverage, lowestAverage);
    }
}
