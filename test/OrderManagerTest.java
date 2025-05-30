import manager.OrderManager;
import model.Orders;
import java.util.Scanner;
import java.time.LocalDateTime;

public class OrderManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();

        while (true) {
            System.out.println(" MENU QUAN LY DON HANG");
            System.out.println("1. Them don hang moi");
            System.out.println("2. Sua don hang");
            System.out.println("3. Xoa don hang");
            System.out.println("4. Hien thi danh sach don hang");
            System.out.println("5. Hien thi don hang da hoan thanh");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon cua ban: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Loi: Vui long nhap so! Nhap lai.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhap Order ID: ");
                    int orderId = scanner.nextInt();
                    System.out.print("Nhap Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap trang thai (datcoc/hoanthanh): ");
                    String status = scanner.nextLine();
                    System.out.print("Nhap Tien dat coc: ");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine();
                    Orders newOrder = new Orders(orderId, customerId, LocalDateTime.now(), LocalDateTime.now(), status, deposit);
                    orderManager.addOrder(newOrder);
                    break;

                case 2:
                    System.out.print("Nhap Order ID can sua: ");
                    int editOrderId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap Trang thai moi: ");
                    String newStatus = scanner.nextLine();
                    System.out.print("Nhap Tien dat coc moi: ");
                    double newDeposit = scanner.nextDouble();
                    scanner.nextLine();
                    orderManager.updateOrder(editOrderId, newStatus, newDeposit);
                    break;

                case 3:
                    System.out.print("Nhap Order ID can xoa: ");
                    int deleteOrderId = scanner.nextInt();
                    scanner.nextLine();
                    orderManager.deleteOrder(deleteOrderId);
                    break;

                case 4:
                    System.out.println("Danh sach don hang:");
                    orderManager.printOrderList();
                    break;

                case 5:
                    System.out.println("Danh sach don hang da hoan thanh:");
                    for (Orders order : orderManager.getOrders()) {
                        if ("hoanthanh".equalsIgnoreCase(order.getStatus()) || "da hoan thanh".equalsIgnoreCase(order.getStatus())) {
                            System.out.println("Order ID: " + order.getOrderId() +
                                               ", Customer ID: " + order.getCustomerId() +
                                               ", Status: " + order.getStatus() +
                                               ", Deposit: " + order.getDeposit());
                        }
                    }
                    break;

                case 6:
                    System.out.println("thoat!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }
}
