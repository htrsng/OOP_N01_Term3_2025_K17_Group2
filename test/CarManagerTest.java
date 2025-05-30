import manager.CarManager;
import model.Car;

public class CarManagerTest {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();

        // Test them xe
        carManager.addCar(new Car("XE100", "VinFast Fadil", "VinFast", 35000.0, 7, "conhang"));
        carManager.addCar(new Car("XE101", "Hyundai Accent", "Hyundai", 42000.0, 5, "conhang"));

        System.out.println("\nDanh sach xe sau khi them:");
        carManager.printCarList();
    }
}