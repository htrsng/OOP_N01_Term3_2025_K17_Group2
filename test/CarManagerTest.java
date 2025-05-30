package test; 

import manager.CarManager;
import model.Car;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CarManagerTest {
    private CarManager carManager;

    @Before
    public void setUp() {
        carManager = new CarManager();
        // Thêm dữ liệu ban đầu để kiểm thử
        carManager.addCar(new Car("XE001", "Toyota Camry", "Toyota", 50000.0, 10, "conhang"));
        carManager.addCar(new Car("XE002", "Honda", "Honda", 40000.0, 0, "hethang"));
    }

    @Test
    public void testAddCar() {
        Car newCar = new Car("XE003", "Mazda", "Mazda", 60000.0, 5, "con");
        carManager.addCar(newCar);
        ArrayList<Car> cars = carManager.getCars();
        assertEquals(3, cars.size());
        assertEquals("Mazda", cars.get(2).getCarName());
    }

    @Test
    public void testEditCar() {
        carManager.getEditCar("Honda New", "XE002");
        ArrayList<Car> cars = carManager.getCars();
        assertEquals("Honda New", cars.get(1).getCarName());
    }

    @Test
    public void testDeleteCar() {
        carManager.getDeleteCar("XE001");
        ArrayList<Car> cars = carManager.getCars();
        assertEquals(1, cars.size());
        assertEquals("XE002", cars.get(0).getCarId());
    }

    @Test
    public void testPrintCarList() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        carManager.printCarList();
        String expectedOutput = "Ma Xe: XE001, Ten Xe: Toyota Camry, Hang Xe: Toyota, Gia: 50000.0, So Luong: 10, Trang Thai: conhang\n" +
                               "Ma Xe: XE002, Ten Xe: Honda, Hang Xe: Honda, Gia: 40000.0, So Luong: 0, Trang Thai: hethang\n";
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out); // Khôi phục System.out
    }
}