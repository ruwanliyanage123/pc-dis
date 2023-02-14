
public class Ram {
    private String model;
    private String price;
    private String storage;
    public Ram(String price, String storage) {
        this.price = price;
        this.storage = storage;
        System.out.println("Ram storage and price");
    }

    public Ram(String price) {
        this.price = price;
        this.storage = "4";
        System.out.println("Ram no storage and only price");
    }

    public Ram() {
        System.out.println("no arg ram constructor");
    }

    public Ram(int a) {
        System.out.println("ram number");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
