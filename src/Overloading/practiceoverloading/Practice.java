package Overloading.practiceoverloading;

public class Practice {
    public void car(String Toyota, int year) {

        System.out.println ( "Car model is: " + Toyota + " " + year );

    }

    public void car(double price) {
        System.out.println ( "Car Price: " + price );
    }

    public void car(String color) {
        System.out.println ( "Car color is: " + color );
    }
}


