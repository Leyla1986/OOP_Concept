package inheritance.season;

public class Spring extends Season {

    public static void main(String[] args) {
        Season obj = new Season("Spring", 98, 66);
        System.out.println(obj.toString());
        System.out.println(obj.activity("Go outside"));
    }
    public Spring(String name, int highestAverage, int lowestAverage) {
        super(name, highestAverage, lowestAverage);
    }
}
