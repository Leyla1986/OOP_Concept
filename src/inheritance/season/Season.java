package inheritance.season;

public class Season {
    /**
     * instance variables
     * - name (String)
     * - highest average temperature
     * - lowest average temperature
     */

    String name;
    int highestAverage;
    int lowestAverage;

    /**
     * constructor:
     * - initialize all fields
     */
    public Season(String name, int highestAverage, int lowestAverage) {
        this.name = name;
        this.highestAverage =highestAverage;
        this.lowestAverage=lowestAverage;

    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }

    /**
     * methods:
     * - activity(), toString()
     * @return
     */


    public String activity(String firePlace){
        return firePlace;
    }
}
