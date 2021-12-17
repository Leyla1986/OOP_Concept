package inheritance.biggertask;

public class Streaming extends Entertainment {
    double duration;

    public Streaming(String name, String company,double duration) {
        super(name, company);
        this.duration=duration;


    }
}
