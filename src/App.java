import manager.CarManager;
import model.Car;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();

        carManager.addCar(new Car("XE001", "Toyota Camry", "Toyota", 50000.0, 10, "conhang"));
        carManager.addCar(new Car("XE002", "Honda", "Honda", 40000.0, 0, "hethang"));

        while (true) {
            try {
                System.out.println("\nMenu quan ly xe");
                System.out.println("1. Them xe moi");
                System.out.println("2. Sua thong tin xe");
                System.out.println("3. Xoa xe");
                System.out.println("4. Hien thi danh sach xe");
                System.out.println("5. Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Nhap thong tin xe moi:");
                        System.out.print("Ma xe: ");
                        String carId = scanner.nextLine();
                        System.out.print("Ten xe: ");
                        String carName = scanner.nextLine();
                        System.out.print("Hang xe: ");
                        String brand = scanner.nextLine();
                        System.out.print("Gia: ");
                        double price = scanner.nextDouble();
                        System.out.print("So luong: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Trang thai: ");
                        String status = scanner.nextLine();
                        Car newCar = new Car(carId, carName, brand, price, quantity, status);
                        carManager.addCar(newCar);
                        break;

                    case 2:
                        System.out.print("Nhap ma xe can sua: ");
                        String editCarId = scanner.nextLine();
                        System.out.println("Nhap thong tin moi cho xe:");
                        System.out.print("Ten xe: ");
                        String newCarName = scanner.nextLine();
                        System.out.print("Hang xe: ");
                        String newBrand = scanner.nextLine();
                        System.out.print("Gia: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("So luong: ");
                        int newQuantity = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Trang thai: ");
                        String newStatus = scanner.nextLine();
                        carManager.updateCar(editCarId, newCarName, newBrand, newPrice, newQuantity, newStatus);
                        break;

                    case 3:
                        System.out.print("Nhap ma xe can xoa: ");
                        String deleteCarId = scanner.nextLine();
                        carManager.deleteCar(deleteCarId);
                        break;

                    case 4:
                        System.out.println("Danh sach xe:");
                        carManager.printCarList();
                        break;

                    case 5:
                        System.out.println("Tam biet!");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Lua chon khong hop le! Vui long chon lai.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Loi: Vui long nhap dung dinh dang.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Loi khong xac dinh: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}