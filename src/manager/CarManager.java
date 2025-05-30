package manager;

import model.Car;
import java.util.ArrayList;

public class CarManager {
    ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> addCar(Car car) {
        cars.add(car);
        System.out.println("Da them xe: " + car.getCarName());
        return cars;
    }

    public ArrayList<Car> getEditCar(String carName, String carId) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarId().equals(carId)) {
                System.out.println("true");
                cars.get(i).setCarName(carName);
            }
        }
        return cars;
    }

    public ArrayList<Car> getDeleteCar(String carId) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarId().equals(carId)) {
                cars.remove(i);
                System.out.println("Da xoa xe " + carId);
            }
        }
        return cars;
    }

    public void printCarList() {
        int len = cars.size();
        for (int i = 0; i < len; i++) {
            System.out.println("Ma Xe: " + cars.get(i).getCarId() + 
                             ", Ten Xe: " + cars.get(i).getCarName() + 
                             ", Hang Xe: " + cars.get(i).getBrand() + 
                             ", Gia: " + cars.get(i).getPrice() + 
                             ", So Luong: " + cars.get(i).getQuantity() + 
                             ", Trang Thai: " + cars.get(i).getStatus());
        }
    }

    public void editCar(String carId, String carName, String brand, double price, int quantity, String status) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                car.setCarName(carName);
                car.setBrand(brand);
                car.setPrice(price);
                car.setQuantity(quantity);
                car.setStatus(status);
                System.out.println("Da sua thong tin xe co ma: " + carId);
                return;
            }
        }
        System.out.println("Khong tim thay xe co ma: " + carId);
    }
}