
# OOP_N01_Term3_2025_K17_Group2

#  ỨNG DỤNG QUẢN LÝ CỬA HÀNG BÁN XE
 
**GIỚI THIỆU:** Ứng dụng web quản lý cửa hàng xe giúp cho người đung quản lý số lượng xe, danh sách khách hàng và các hóa đơn mua hàng một cách thuận tiện và trực quan.
- Quản lý khách hàng
- Quản lý số lượng xe
- Quản lý đơn đặt xe

**Thành Viên Nhóm**
- Nguyễn Thị Huyền Trang_23010181 : Phát triển phần mềm
- Đặng Đắc Tú_23010619 : Phát triển phần mềm
- Lưu Quang Dũng_23010665 : Phát triển phần mềm

  ---

 ## Chức Năng Chính :
 **Quản lý khách hàng :**
 - Thêm , sửa , xóa thông tin khách hàng như tên , số điện thoại ..
 - Hiển thị chi tiết thông tin khách hàng bao gồm các thông tin cơ bản trước đó cùng với ngày đăng kí tài khoản , tổng số tiền đã mua kèm với các thông tin về lịch sử mua hàng trước đó.
 - Lọc danh sách tìm kiếm người dùng theo thông tin.
   
**Quản lý xe :**
- Thêm , sửa , xóa các thông tin của xe .
- Lọc hiển thị danh sách xe theo thông tin , trạng thái trong kho (còn , hết , sắp hết)
- Hiển thị thông tin cơ bản của xe kèm theo đó là ngày được cho vào kho để dễ quản lý hơn

**Quản lý hóa đơn :**
- Thêm , sửa , xóa hóa đơn.
- Tìm kiếm , lọc hiển thị danh sách xe dựa các thông tin của xe , dựa vào ngày tạo đơn , trạng thái của hóa đơn .
- Hiển thị chi tiết đơn hàng .
- In hóa đơn gồm thông tin của xe , của khách hàng rồi in hóa đơn ở dạng file pdf.

---
 ## Thiết Kết Cơ Sở Dữ Liệu
 

 **Customer**


 | Trường           | Kiểu dữ liệu           | Mô tả                                                           |
|------------------|------------------------|------------------------------------------------------------------|
| id               | String                 | Mã khách hàng                                                    |
| name             | String                 | Tên khách hàng                                                   |
| email            | String                 | Địa chỉ email                                                    |
| phoneNumber      | String                 | Số điện thoại (gồm 9–11 chữ số)                                 |
| address          | String                 | Địa chỉ                                                          |
| registrationDate | Date                   | Ngày đăng ký                                                     |
| purchaseHistory  | List<Invoice>          | Danh sách hóa đơn của khách hàng                                |


 **Car**

 
 |Trường|Kiểu dữ liệu| Mô tả|
 ----------------|---------------------|------------------------------------|
| carId          | String        | Mã xe (khóa chính, không được để trống) |
| brand          | String             | Thương hiệu xe (không được để trống) |
| model          | String             | Mô hình xe (không được để trống)   |
| year           | int                | Năm sản xuất (≥ 1900)              |
| price          | double             | Giá xe (phải dương)                |
| status         | String             | Trạng thái xe (không được để trống) |
| importDate     | Date               | Ngày nhập kho (bắt buộc)           |
| quantity       | int                | Số lượng xe trong kho (≥ 0)
 

 **Invoice**


 | Trường          | Kiểu dữ liệu     | Mô tả                                                           |
|-----------------|------------------|------------------------------------------------------------------|
| invoiceId       | String           | Mã hóa đơn                                                       |
| customer        | Customer         | Khách hàng                                    |
| car             | Car              | Xe (quan hệ nhiều–một)                                           |                 |
| totalAmount     | double           | Tổng tiền (phải là số dương)                                     |
| paymentStatus   | PaymentStatus    | Trạng thái thanh toán (PENDING hoặc PAID)                        |
| paymentHistory  | List<Payment>    | Lịch sử thanh toán (xóa tự động khi hóa đơn bị xóa)             |
| note            | String           | Ghi chú (không bắt buộc)                                         |
| pickupDate      | Date             | Ngày nhận xe (có thể để trống)                                   | 

---
 ## Công Nghệ Đã Sử Dụng:
 
#### 1. Frontend
- **Engine dựng HTML**: Sử dụng Thymeleaf làm template engine, tích hợp trực tiếp trong Spring Boot để tạo ra các trang HTML động.  
  ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

#### 2. Backend
- **Framework chính**: Phát triển ứng dụng web theo kiến trúc MVC, bao gồm:  
  - **Controller**: Xử lý request và trả về response.  
  - **Service**: Thực hiện logic nghiệp vụ.  
  - **Repository**: Quản lý truy vấn dữ liệu.  
  - **Model**: Đại diện cho các thực thể dữ liệu.  
- **Ngôn ngữ**: Java 17.  
- **Framework**: Spring Boot 3.5.3.  
- **Thư viện**: Spring Web (xử lý web), Spring Data JPA (quản lý cơ sở dữ liệu).

#### 3. Lưu trữ dữ liệu
- **Cơ sở dữ liệu**: Sử dụng MySQL được cung cấp qua Aiven Cloud để lưu trữ và quản lý dữ liệu lâu dài.
- **Kết nối**: Tích hợp với Spring Data JPA, sử dụng cấu hình SSL để đảm bảo kết nối an toàn với Aiven MySQL
#### 4. Build Tool: Quản lý thư viện và biên dịch dự án
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)



## Cấu Trúc Thư Mục

```text

OOP_N01_Term3_2025_K17_Group2/
├── .vscode/
│   └── settings.json
│   └── launch.json
├── img
├── review
├── springbootApp/                 # PHẦN 1: Ứng dụng web Spring Boot
│   ├── complete/
│   │   ├── pom.xml
│   │   ├── mvnw
│   │   ├── .mvnw
│   │   ├── mvnw.cmd
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/com/example/servingwebcontent/
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── CarController.java
│   │   │   │   │   │   ├── CustomerController.java
│   │   │   │   │   │   ├── InvoiceController.java
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── Car.java
│   │   │   │   │   │   ├── Customer.java
│   │   │   │   │   │   └── Invoice.java
│   │   │   │   │   │   └── Payment.java
│   │   │   │   │   │   └── PaymentStatus.java
│   │   │   │   │   ├── repository/
│   │   │   │   │   │   ├── CarRepository.java
│   │   │   │   │   │   ├── CustomerRepository.java
│   │   │   │   │   │   └── InvoiceRepository.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── Carlist.java
│   │   │   │   │   │   ├── CustomerList.java
│   │   │   │   │   │   ├── InvoiceList.java
│   │   │   │   │   ├── GreetingController.java
│   │   │   │   │   └── ServingWebContentApplication.java
│   │   │   ├── resources/
│   │   │   │   ├── static/
│   │   │   │   │   └── index.html
│   │   │   │   ├── templates/
│   │   │   │   │   └── greeting.html
│   │   │   │   │   └── car
│   │   │   │   │   └── customer
│   │   │   │   │   └── invoice
│   │   │   │   └── application.properties
│   │   ├── test/java/com/example/servingwebcontent/
│   │   │   ├── testcontroller/
│   │   │   │   ├── CarControllerTest.java
│   │   │   │   ├── CustomerSlipControllerTest.java
│   │   │   │   ├── InvoiceControllerTest.java
│   │   │   └── ServingWebContentApplicationTest.java
│   │   ├── target/test-classes/...               # File biên dịch
│
├── qlcuahang/                                     # PHẦN 2: Java core (không dùng Spring)
│   ├── src/
│   │   ├── bin
│   │   ├── manager
│   │   ├── model
│   │   ├── App.class
│   ├── test/
│   │   ├── CarManagerTest.java
│   │   ├── CustomerManagerTest.java
│   │   ├── InvoiceManagerTest.java
│   │   ├── TestSequence.java
│   │   ├── TestStudent.java
├──.gitignore
├── README.md 

 ```

## Mô Hình Và Chức Năng

## 1. Mô Hình Hệ Thống - Kiến Trúc MVC (Model - View - Controller)

Ứng dụng được thiết kế theo mô hình **MVC**, bao gồm ba thành phần chính:

###  Model

Chứa các lớp đại diện cho thực thể trong hệ thống:

- **Car**: Đại diện cho thông tin xe ô tô (mã xe, thương hiệu, mô hình, năm sản xuất, giá, trạng thái, ngày nhập kho, số lượng).
- **Customer**: Đại diện cho thông tin khách hàng (mã khách hàng, tên, email, số điện thoại, địa chỉ, ngày đăng ký, lịch sử mua hàng).
- **Invoice**: Đại diện cho thông tin hóa đơn (mã hóa đơn, khách hàng, xe, tổng tiền, ngày lập, trạng thái thanh toán, lịch sử thanh toán, ghi chú, ngày nhận xe).

###  View

Sử dụng **Thymeleaf** làm template engine để tạo các trang HTML động:

- **Trang danh sách đơn hàng**: Hiển thị danh sách hóa đơn đã tạo.
- **Trang thêm sản phẩm**: Cho phép người dùng nhập thông tin để thêm xe mới.
- **Trang thống kê doanh thu**: Hiển thị các báo cáo về tổng doanh thu và trạng thái thanh toán.

###  Controller

- Nhận các yêu cầu từ người dùng (qua URL hoặc nút bấm trên giao diện).
- Gọi các phương thức trong lớp **Service** để xử lý logic nghiệp vụ và trả về dữ liệu cho View.

---

## 2. Chức Năng Hệ Thống

Dựa trên mô hình MVC, ứng dụng cung cấp các chức năng chính sau:

###  Quản Lý Xe (Car)

- Thêm, sửa, xóa thông tin xe.
- Tìm kiếm xe theo **thương hiệu**, **mô hình**, **năm sản xuất**, hoặc **trạng thái**.
- Lọc xe theo **khoảng giá**, **số lượng tồn kho**, hoặc **trạng thái** (Available, Sold, Reserved, OutOfStock).

###  Quản Lý Khách Hàng (Customer)

- Thêm, sửa, xóa thông tin khách hàng.
- Tìm kiếm khách hàng theo **tên**, **email**, **số điện thoại**, hoặc **địa chỉ**.
- Lọc khách hàng theo **ngày đăng ký** hoặc **tổng tiền mua hàng**.

###  Quản Lý Hóa Đơn (Invoice)

- Tạo hóa đơn mới cho khách hàng khi mua xe.
- Cập nhật thông tin hóa đơn (**tổng tiền**, **khách hàng**, **xe**).
- Xóa hóa đơn (chỉ khi **chưa thanh toán**).
- Thêm thanh toán cho hóa đơn và cập nhật **trạng thái** (Pending, Paid).
- Tìm kiếm hóa đơn theo **mã**, **tên khách hàng**, **ngày lập**, hoặc **trạng thái thanh toán**.
- Lọc hóa đơn theo **khoảng thời gian nhận xe**.
---

### UML DIAGRAM
##### CLASS DIAGRAM 

 <div align="center">

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/clasdia.png)

</div>

##### SEQUENCE DIAGRAM
**Invoice**
 <div align="center">

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/sequediagram%20(1).png)

</div>

**Car**
<div align="center">

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/carDIA.png)

</div>

**Customer**
<div align="center">

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/sequediagram%20(1).png)

</div>


### Giao Diện Website
**Menu**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/UI1.png)

**Quản lý khách hàng**

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/UIcus.png)

**Thêm khách hàng**

![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/addcus.png)

**Danh sách khách hàng**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/listcus.png)

**Quản lý xe**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/UIcar.png)
**Thêm xe**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/addcar.png)
**Danh sách xe**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/lisCar.png)
**Tạo hóa đơn**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/taoHD.png)
**Danh sách hóa đơn**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/lisHD.png)
**In hóa đơn**
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/inHD.png)






