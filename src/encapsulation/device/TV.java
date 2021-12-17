package encapsulation.device;

public class TV {
    /**
     * - attributes: brand, model, price, wireless
     * - methods: toString(),
     * useDevice(): Override to print Using TV
     */
    public static void main(String[] args) {


        Device tv = new Device("Samsung", "S350 Ultra HD", 763.50, true);
        System.out.println(tv.useDevice());
        System.out.println(tv.toString());
    }


}

