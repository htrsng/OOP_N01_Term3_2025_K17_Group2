
# OOP_N01_Term3_2025_K17_Group2

# QUẢN LÝ CỬA HÀNG BÁN XE
 
**GIỚI THIỆU:** Ứng dụng web quản lý cửa hàng xe giúp cho người đung quản lý số lượng xe, danh sách khách hàng và các hóa đơn mua hàng một cách thuận tiện và trực quan.
- Quản lý khách hàng
- Quản lý số lượng xe
- Quản lý đơn đặt xe

 **Tính Năng** 
- Tổng quát về bảng điều khiển và số liệu thống kê
- Quản lý danh sách xe trong kho
- Nhập/Xuất số lượng xe trong kho hàng
- Quản lý danh sách khách hàng 
- Thêm thông tin khách hàng
- Tạo hóa đơn 
- Tìm kiếm thông tin hóa đơn
- Trực quản hóa dữ liệu
- In hóa đơn 

 ## Thiết Kết Cơ Sở Dữ Liệu
 

 **Customer**

<div align="center">


 |Trường     | Kiểu dữ liệu | Mô tả        |
 |-----------|--------------|--------------|
 |name       |        String|Tên khách hàng|
 |email      |        String| Địa chỉ email|
 |phoneNumber|        String| Số điện thoại|
 |address    |String        |       Địa chỉ|
 |purchases  |List<invoice>,@OneToMany)</invoice>|Mua hàng|

Phương thức
 |Trường|Mô tả|
 |---|----|
 |addPurchase(Invoice)|Thêm hóa đơn vào danh sách mua hàng| 
 |deletePurchase(String invoiceId)|Xóa đơn hàng khỏi danh sách| 

</div>

 **Car**

<div align="center">
 
 |Trường|Kiểu dữ liệu| Mô tả|
 |---|----|----|
 |carId|String,@Id|Mã xe|
 |brand|String|Hãng xe|
 |model|String|Mẫu xe|
 |year|int|năm|
 |price|double|giá|
 |status|String:(Available, Sold, Reserved)|Trạng thái|
 |importDate|Date|Ngày nhập|
 |purchaseHistory|(List<invoice>, @OneToMany)</invoice>|Lịch sử mua|
 
Phương thức

 |Trường| Mô tả|
 |---|----|
 |sellCar()|Đặt **status** thành "Sold"|
 |isAvailable()|Kiểm tra **status** là "Available".
 |getCarDetails()| trả về thông tin chi tiết|

</div>

 **Invoice**

<div align="center">

 |Trường|Kiểu dữ liệu| Mô tả|
 |---|----|----|
 |invoiceId| String, @Id|Mã hóa đơn|
 |customer|Customer, @ManyToOne|Khách hàng|
 |car|Car,@ManyToOne|Xe|
 |date|Date|Thời gian|
 |totalAmount|double|Tổng số lượng|

 Phương thức 
 
 |Trường| Mô tả|
 |---|----|
 |isValid()|Kiểm tra hóa đơn hợp lệ|
 |updateTotalAmount(double)|Cập nhập tổng tiền và trạng thái xe|
 |getInvoiceDetails()|Trả về thông tinn chi tiết|
 
 </div>

 ## Công Nghệ Đã Sử Dụng:
 
1. Frontend: Engine dựng HTML, tích hợp trực tiếp trong Spring Boot
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
2. Backend: Framework chính để phát triển ứng dụng web (theo kiến trúc MVC)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
3. Database: CSDL quan hệ để lưu trữ đơn hàng, sản phẩm, khách hàng...
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
4. Build Tool: Quản lý thư viện và biên dịch dự án
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## Cấu Trúc Dự Án 

- Mô hình: MVC (Model - View - Controller)
- Controller: Xử lý yêu cầu HTTP
- Model: Các lớp thực thể Car, Customer, Invoice
- Repository: Giao diện JPA kết nối với cơ sở dữ liệu
- Ứng dụng chính: OOPApplication khởi chạy hệ thống

## Cấu Trúc Thư Mục

```text

OOP_N01_Term3_2025_K17_Group2-main
├───qlcuahang
            ├───src
            │   │   App.class
            │   │   App.java
            │   │
            │   ├───bin
            │   │   │   App.class
            │   │   │
            │   │   ├───manager
            │   │   │       CarManager.class
            │   │   │       CustomerManager.class
            │   │   │
            │   │   └───model
            │   │           Car.class
            │   │           Customer.class
            │   │
            │   ├───manager
            │   │       CarManager.class
            │   │       CarManager.java
            │   │       CustomerManager.class
            │   │       CustomerManager.java
            │   │       OrderDetailsManager.class
            │   │       OrderDetailsManager.java
            │   │       OrderManager.class
            │   │       OrderManager.java
            │   │       SaleManager.java
            │   │
            │   └───model
            │           Car.class
            │           Car.java
            │           Customer.class
            │           Customer.java
            │           Invoice.java
            │           Payment.java
            │           PaymentStatus.java
            │
            └───test
                    CarManagerTest.java
                    CustomerManagerTest.java
                    OrderDetailsManagerTest.java
                    OrderManagerTest.java
                    SaleManagerTest.java
                    TestSequence.java
                    TestStudent.java

 ```

## Mô Hình Và Chức Năng

1. Mô hình hệ thống - Kiến trúc MVC (Model - view - Controller)
Ứng dụng quản lý được phân ra làm ba phân chính theo mô hình MVC gồm:
- Model
Chứa các lớp đại diện thực thể trong hệ thống:

Car - Xe ôtô
Customer - khách hàng 
Invoice - Hóa đơn

- View
Sử dụng Thymeleaf để hiển thị các trang HTML động:

Trang danh sách đơn hàng
Trang thêm sản phẩm
Trang thống kê doanh thu

- Controller

Nhận các yêu cầu từ người dùng (qua URL hoặc button)
Gọi Service để xử lý logic
Trả về kết quả tới View hoặc dữ liệu JSON (nếu dùng REST)

2. Chức năng hệ thống (theo từng mô-đun)
   - Sản phẩm (Product)
Thêm, sửa, xóa sản phẩm
Lọc tìm theo mã hoặc tên sản phẩm

- Hóa đơn 
Tạo, sửa, xóa đơn hàng

Lọc đơn theo:

Trạng thái

Ngày tạo

Khách hàng

Tên xe

Tính tổng tiền hóa đơn

- Khách hàng 

Khách mua trực tiếp

Quản lý thông tin, sửa, xóa

Lọc tìm theo tên hoặc mã

- Luồng xử lý chức năng tiêu biểu
Ví dụ: Tạo đơn hàng

Người dùng chọn Sales Invoices → tạo mã hóa đơn → chọn thông tin khách hàng

chọn thông tin xe → nhập số lương mua

chọn ngày mua → lưu đơn hàng

Cập nhật lại tồn kho

Trả về View hiển thị thêm đơn mới 

### UML DIAGRAM
##### CLASS DIAGRAM 

 <div align="center">

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/Bi%E1%BB%83u%20%C4%91%E1%BB%93%20kh%C3%B4ng%20c%C3%B3%20ti%C3%AAu%20%C4%91%E1%BB%81.drawio.png)

</div>

##### SEQUENCE DIAGRAM

 <div align="center">

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/sequediagram%20(1).png)

</div>

- Nội dung 04:
Cập nhật code cho CRUD (create/read/update/delete)  và chạy kiểm định (test) cho ít nhất 03 đối tượng trong bài tập lớn (đã hoàn thành)

![image](https://github.com/user-attachments/assets/179cfcee-a8bd-4701-8392-14fbb1b82858)


Practice 6: Yêu cầu số 5 (của bài tập lớn)
Câu  số 1. Các thành viên trong nhóm thảo luận 01 chức năng [phương thức] hoạt động chính [main] của  bài tập cuối kỳ. Sau đó, thực hiện thảo luận nhóm và vẽ lưu đồ thuật toán cho chức năng này. 
+ Chức năng hay phương thức hoạt động này phải là nội dung cốt lõi của ứng dụng của Nhóm  : Chức năng này cho phép nhân viên cửa hàng thực hiện quy trình bán xe, từ việc tạo đơn hàng (khi khách hàng đặt cọc), kiểm tra xe có sẵn để giao, đến cập nhật trạng thái đơn hàng thành "completed" khi giao xe thành công. Chức năng này liên quan đến cả Car, Customer, và Orders, là cốt lõi của ứng dụng quản lý cửa hàng xe của nhóm .

Phân tích thuật toán thành các chức năng nhỏ : 

 + Kiểm tra xe có sẵn để bán: Kiểm tra xem xe (dựa trên ID xe) có trạng thái "conhang" và số lượng đủ để giao hay không.
 + Tạo đơn hàng mới: Tạo một đơn hàng với thông tin khách hàng, xe, ngày đặt cọc, và số tiền đặt cọc.
 + Giao xe và cập nhật trạng thái đơn hàng: Khi giao xe thành công, cập nhật trạng thái đơn hàng thành "completed", giảm số lượng xe trong kho, và ghi nhận thời gian giao xe.




  ## Thành viên và Phân chia công việc: 

**Thành Viên**

|         Thành viên     |         Mã sinh viên    |        
|------------------------|-------------------------|
| Nguyễn Thị Huyền Trang |        23010181         | 
| Đặng Đắc Tú            |  23010619               |
| Lưu Quang Dũng         |   23010665              |

**Phân chia công việc**

|         Thành viên     |         Phân công                      |        
|------------------------|----------------------------------------|
| Nguyễn Thị Huyền Trang | Khởi tạo dự án, Quản lý xe             | 
| Đặng Đắc Tú            | Liên kết Dữ Liệu, Quản lý khách hàng   |
| Lưu Quang Dũng         | Xuất hóa đơn, Quản lý đơn hàng         |


