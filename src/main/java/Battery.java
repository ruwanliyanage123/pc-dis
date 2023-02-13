import org.springframework.stereotype.Component;

@Component
public class Battery {
    private String brand;
    private String price;
    private String batteryLife;

    private String message;

    public Battery(String brand, String price, String batteryLife) {
        this.brand = brand;
        this.price = price;
        this.batteryLife = batteryLife;
    }

    public Battery(String brand, String price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Battery two arg constr");
    }

    public Battery(String brand) {
        this.brand = brand;
        System.out.print("Battery one arg constr");

    }

    public Battery() {
        System.out.println("Battery no arg constr");
    }

    public Battery(int a) {
        System.out.println("battery number");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
