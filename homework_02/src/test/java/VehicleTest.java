import org.junit.jupiter.api.Test;
import tests.Car;
import tests.Motorcycle;
import tests.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Lamborghini", "Huracan", 2017);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Mercedes-Benz", "G-класс", 2011);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2018);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Mercedes-Benz", "G-класс", 2011);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2018);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void testCarPark() {
        Car car = new Car("Mercedes-Benz", "G-класс", 2011);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2018);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
