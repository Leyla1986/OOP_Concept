package inheritance.season;

public class Winter extends Season {

    /**
     * constructor: set values to variables
     */

    public static void main(String[] args) {

        Season obj = new Season("Winter", 100, 45);
        System.out.println(obj.toString());
        System.out.println(obj.activity("FirePlace"));

    }

    public Winter(String name, int highestAverage, int lowestAverage){
            super(name, highestAverage, lowestAverage);

        }

}