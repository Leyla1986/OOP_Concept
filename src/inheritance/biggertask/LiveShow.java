package inheritance.biggertask;

public class LiveShow extends Entertainment{
    /** location(String) */


    String location;

    public LiveShow(String name, String company,String location) {
        super(name, company);
        this.location= location;
    }
}
