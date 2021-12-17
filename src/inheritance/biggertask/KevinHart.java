package inheritance.biggertask;

public class KevinHart extends LiveShow {

    /**
     * String performer;
     * String data;
     */

    public static void main(String[] args) {
        KevinHart kevin = new KevinHart("HTTPS","WALLMART",
                "Bentonville","Leyla","12/16/2021");
        System.out.println(kevin.toString());
    }

    String performer;
    String data;

    public KevinHart(String name, String company, String location, String performer, String data) {
        super(name, company, location);
        this.performer = performer;
        this.data = data;


    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", performer='" + performer + '\'' +
                ", data='" + data + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
