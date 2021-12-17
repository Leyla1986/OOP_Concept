package encapsulation;

public class UseAmazon {
    public static void main(String[] args) {
        /**
         * create an object of the AmazonAccount and verify the constructor
         *  getters, and setters and toString are working properly
         */
        AmazonAccount amazon = new AmazonAccount("Leyla", "leyla.necefzade@gmail.com", false);


        amazon.setUserName("Leyla");
        amazon.setEmail("leyla.necefzade@gmail.com");
        amazon.setHasPrime(false);

        System.out.println(amazon.toString());




    }
}
