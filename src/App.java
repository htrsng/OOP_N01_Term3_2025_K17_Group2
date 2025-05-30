import manager.CarManager;
import model.Car;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();
        
        // Thêm dữ liệu ban đầu (có thể bỏ nếu không cần)
        carManager.addCar(new Car("XE001", "Toyota Camry", "Toyota", 50000.0, 10, "conhang"));
        carManager.addCar(new Car("XE002", "Honda", "Honda", 40000.0, 0, "hethang"));

        while (true) {
            System.out.println(" MENU QUAN LY XE");
            System.out.println("1. Them xe moi");
            System.out.println("2. Sua thong tin xe");
            System.out.println("3. Xoa xe");
            System.out.println("4. Hien thi danh sach xe");
            System.out.println("5. Thoat");
            int choice;
            while (true) {
                System.out.print("Nhap lua chon cua ban: ");
                String input = scanner.nextLine();
                try {
                    choice = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so tu 1 den 5!");
                }
            }

            switch (choice) {
                case 1: // Thêm xe
                    System.out.println("Nhap thong tin xe moi:");
                    System.out.print("Ma xe: ");
                    String carId = scanner.nextLine();
                    System.out.print("Ten xe: ");
                    String carName = scanner.nextLine();
                    System.out.print("Hang xe: ");
                    String brand = scanner.nextLine();
                    System.out.print("Gia: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Thêm dòng này để loại bỏ '\n'
                    System.out.print("So luong: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Thêm dòng này để loại bỏ '\n'
                    System.out.print("Trang thai: ");
                    String status = scanner.nextLine();
                    Car newCar = new Car(carId, carName, brand, price, quantity, status);
                    carManager.addCar(newCar);
                    break;

                case 2: // Sửa xe
                    System.out.print("Nhap ma xe can sua: ");
                    String editCarId = scanner.nextLine();
                    System.out.println("Nhap thong tin moi cho xe:");
                    System.out.print("Ten xe: ");
                    String newCarName = scanner.nextLine();
                    System.out.print("Hang xe: ");
                    String newBrand = scanner.nextLine();
                    System.out.print("Gia: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // Thêm dòng này để loại bỏ '\n'
                    System.out.print("So luong: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Thêm dòng này để loại bỏ '\n'
                    System.out.print("Trang thai: ");
                    String newStatus = scanner.nextLine();
                    carManager.editCar(editCarId, newCarName, newBrand, newPrice, newQuantity, newStatus);
                    break;

                case 3: // Xóa xe
                    System.out.print("Nhap ma xe can xoa: ");
                    String deleteCarId = scanner.nextLine();
                    carManager.getDeleteCar(deleteCarId);
                    break;

                case 4: // Hiển thị danh sách
                    System.out.println("Danh sach xe:");
                    carManager.printCarList();
                    break;

                case 5: // Thoat
                    System.out.println("Tam biet!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }
}