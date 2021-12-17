package inheritance.season;

public class Fall extends Season {

    public static void main(String[] args) {
        Season obj = new Season("Fall",55,40);
        System.out.println(obj.toString());
        System.out.println(obj.activity("Read A Book"));
    }
    public Fall(String name, int highestAverage, int lowestAverage) {
        super(name, highestAverage, lowestAverage);
    }
}
