package encapsulation;

public class PersonInformation {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(35);
        person.setGrade(77);
        person.setName("Leyla");
        person.setLastName("Najafzade");


        System.out.println(person.getName() + " " +  person.getLastName() + " " + person.getAge() + " " + person.getGrade());

    }
}