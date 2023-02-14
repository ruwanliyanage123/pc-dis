import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LaptopTest {

    @Test
    private void testLaptop(){
        Ram ram = new Ram();
        Battery battery = new Battery();
        Laptop laptop = new Laptop("Model1", battery, ram);

        assertEquals(laptop.getBattery().getMessage(), "default battery");
        assertEquals(laptop.getRam().getMessage(), "Default Ram");
    }
}