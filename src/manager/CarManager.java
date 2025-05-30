package manager;

import model.Car;
import java.util.ArrayList;

public class CarManager {
    ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> addCar(Car car) {
        try {
            if (car == null) {
                throw new IllegalArgumentException("Xe khong duoc null.");
            }
            cars.add(car);
            System.out.println("Da them xe: " + car.getCarName());
            return cars;
        } catch (Exception e) {
            System.out.println("Loi khi them xe: " + e.getMessage());
            return cars;
        }
    }

    public ArrayList<Car> updateCar(String carId, String carName, String brand, double price, int quantity, String status) {
        try {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getCarId().equals(carId)) {
                    cars.get(i).setCarName(carName);
                    cars.get(i).setBrand(brand);
                    cars.get(i).setPrice(price);
                    cars.get(i).setQuantity(quantity);
                    cars.get(i).setStatus(status);
                    System.out.println("Da cap nhat xe co ma: " + carId);
                    return cars;
                }
            }
            System.out.println("Khong tim thay xe co ma: " + carId);
            return cars;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi truy cap danh sach: " + e.getMessage());
            return cars;
        } catch (Exception e) {
            System.out.println("Loi khi cap nhat xe: " + e.getMessage());
            return cars;
        }
    }

    public ArrayList<Car> deleteCar(String carId) {
        try {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getCarId().equals(carId)) {
                    cars.remove(i);
                    System.out.println("Da xoa xe co ma: " + carId);
                    return cars;
                }
            }
            System.out.println("Khong tim thay xe co ma: " + carId);
            return cars;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi truy cap danh sach: " + e.getMessage());
            return cars;
        } catch (Exception e) {
            System.out.println("Loi khi xoa xe: " + e.getMessage());
            return cars;
        }
    }

    public void printCarList() {
        try {
            int len = cars.size();
            if (len == 0) {
                System.out.println("Danh sach xe trong.");
                return;
            }
            for (int i = 0; i < len; i++) {
                System.out.println("Ma Xe: " + cars.get(i).getCarId() +
                                 ", Ten Xe: " + cars.get(i).getCarName() +
                                 ", Hang Xe: " + cars.get(i).getBrand() +
                                 ", Gia: " + cars.get(i).getPrice() +
                                 ", So Luong: " + cars.get(i).getQuantity() +
                                 ", Trang Thai: " + cars.get(i).getStatus());
            }
        } catch (Exception e) {
            System.out.println("Loi khi hien thi danh sach xe: " + e.getMessage());
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}