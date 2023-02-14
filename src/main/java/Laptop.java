import javax.annotation.Resource;

public class Laptop {

    private Battery battery;
    private Ram ram;

    public Laptop(Battery battery, Ram ram) {
        this.battery = battery;
        this.ram = ram;
        System.out.println("Laptop constructor with battery and ram");
    }

    public Laptop(Ram ram) {
        this.battery = new Battery(1);
        this.ram = ram;
        System.out.println("Laptop constructor with no battery and ram");
    }

    public Laptop(Battery battery) {
        this.battery = battery;
        this.ram = new Ram(1);
        System.out.println("Laptop constructor with battery and no ram");
    }

    public Laptop() {
        this.battery = new Battery(1);
        this.ram = new Ram(1);
        System.out.println("Laptop constructor battery and ram");
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
