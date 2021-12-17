package encapsulation.device;

public class UseDevice {

    /**
     * create an object of TV and Phone and verify if constructor,
     * toString(), and useDevice() are working properly for each class
     * List the is a relation of all the classes
     */

    public static void main(String[] args) {

        TV obj = new TV();

        if (obj == null) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        Phone obj1 = new Phone();

        if (obj == null) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }


}
