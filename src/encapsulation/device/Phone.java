package encapsulation.device;

public class Phone {
    /**
     * - attributes: brand, model, price, wireless
     * - methods: toString(),useDevice():
     * Override to print Using Phone
     */


    public static void main(String[] args) {

        Device phone = new Device("Apple", "Iphone 13 ProMax", 1299.0, true);
       // phone.useDevice();
        System.out.println(phone.toString());
        System.out.println(phone.useDevice());
    }

}
