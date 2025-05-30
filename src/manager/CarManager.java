package manager;

import model.Car;
import java.util.ArrayList;

public class CarManager {
    private ArrayList<Car> cars = new ArrayList<>();

    // Them xe moi vao danh sach
    public void addCar(Car car) {
        if (car == null) {
            System.out.println("Xe khong duoc null.");
            return;
        }
        cars.add(car);
        System.out.println("Da them xe: " + car.getCarName());
    }

    // Sua thong tin xe dua vao carId
    public void updateCar(String carId, String carName, String brand, double price, int quantity, String status) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                car.setCarName(carName);
                car.setBrand(brand);
                car.setPrice(price);
                car.setQuantity(quantity);
                car.setStatus(status);
                System.out.println("Da cap nhat xe co ma: " + carId);
                return;
            }
        }
        System.out.println("Khong tim thay xe co ma: " + carId);
    }

    // Xoa xe dua vao carId
    public void deleteCar(String carId) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarId().equals(carId)) {
                cars.remove(i);
                System.out.println("Da xoa xe co ma: " + carId);
                return;
            }
        }
        System.out.println("Khong tim thay xe co ma: " + carId);
    }

    // Hien thi danh sach xe con hang
    public void displayAvailableCars() {
        boolean found = false;
        System.out.println("Danh sach xe con hang:");
        for (Car car : cars) {
            if ("conhang".equalsIgnoreCase(car.getStatus())) {
                System.out.println("Ma xe: " + car.getCarId() +
                                   ", Ten xe: " + car.getCarName() +
                                   ", Hang: " + car.getBrand() +
                                   ", Gia: " + car.getPrice() +
                                   ", So luong: " + car.getQuantity());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co xe nao con hang.");
        }
    }

    // In toan bo danh sach xe
    public void printCarList() {
        if (cars.isEmpty()) {
            System.out.println("Danh sach xe trong.");
            return;
        }
        for (Car car : cars) {
            System.out.println("Ma xe: " + car.getCarId() +
                               ", Ten xe: " + car.getCarName() +
                               ", Hang: " + car.getBrand() +
                               ", Gia: " + car.getPrice() +
                               ", So luong: " + car.getQuantity() +
                               ", Trang thai: " + car.getStatus());
        }
    }

    // Lay danh sach xe
    public ArrayList<Car> getCars() {
        return cars;
    }
}