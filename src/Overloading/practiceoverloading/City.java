package Overloading.practiceoverloading;

public class City {

    public void city(String officialLanguages, double area) {
        System.out.println("officialLanguages is: " + officialLanguages + "\n" + "Area is: " + area );
    }

    public void city(String capital, String religion) {
        System.out.println("Capital: " + capital + "\n" +"Religion is: " + religion);
    }

    public void city(int callingCode) {
        System.out.println("Area callingCode is: " + callingCode );
    }

    public void city(String president) {
        System.out.println("President: " + president);

    }
}
