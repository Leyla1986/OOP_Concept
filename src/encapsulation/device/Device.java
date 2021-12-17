package encapsulation.device;

public class Device {

    /**
     * - attributes: brand, model, price, wireless
     * - methods: toString(), useDevice()
     */

    private String brand;
    private String model;
    private double price;
    private boolean isWireless;

    public Device (String brand,String model,double price,boolean isWireless){
        this.isWireless= isWireless;
        this.model = model;
        this.brand=brand;
        this.price=price;

    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    /**
     * verify if constructor,
     * toString(), and useDevice() are working properly for each class
     * @return
     */
    public boolean useDevice () {
        if (Device.this.equals(toString())) {
            this.useDevice();
            return true;
        } else {

            return false;
        }

    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }




}
