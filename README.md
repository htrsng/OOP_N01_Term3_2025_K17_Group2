
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

 ## Thiết kết cơ sở dữ liệu
 **Customer**
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

 **Car**
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
 
Phương tthức

 |Trường| Mô tả|
 |---|----|
 |sellCar()|Đặt **status** thành "Sold"|
 |isAvailable()|Kiểm tra **status** là "Available".
 |getCarDetails()| trả về thông tin chi tiết|

 **Invoice**

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
 |isValid|Kiểm tra hóa đơn hợp lệ|
 |updateTotalAmount(double)|Cập nhập tổng tiền và trạng thái xe|
 |getInvoiceDetails()|Trả về thông tinn chi tiết|
 
## Câu 2 . Phân tích cơ sở ít nhất 03 đối tượng
1. **Khách hàng**: quản lý thông tin khách mua xe gồm : mã đơn, tên khách, số điện thoại , mã xe .

2. **Sản phẩm (Xe)**: quản lý các sản phẩm có trong cửa hàng : mã sản phẩm, tên , hãng , giá , số lượng trong kho , tình trang (còn /hết) .

3. **Đơn đặt cọc**: quản lý các đơn đặt xe + đặt cọc : mã đơn, thông tin khách , sản phẩm , ngày đặt , ngày hẹn lấy , tiền cọc , trạng thái đặt (đã /chưa).

## Câu 3 . xây dựng cấu trúc folder của Project
 Đã hoàn thành 

## Các class đã tạo:
1. KhachHang.java
2.  Xe.java
3.  DonDatCoc.java
4. KhachHangTest.java
5. XeTest.java
6.  DonDatCocTest.java

##  Các class kiểm định:
- KhachHangTest.java
- XeTest.java
- DonDatCocTest.java

Project_nhóm-02:
Xây dựng ứng dụng quản lý cửa hàng xe.

Yêu cầu chính:
- Giao diện <b>Java Spring Boot</b>.
- Có chức năng chính :
+ Quản lý khách hàng, xe, và đơn đặt cọc.
+ Và các chức năng khác.

Cụ thể:

- Quản lý Khách hàng
+ chức năng: Thêm, sửa, xóa thông tin khách hàng.
+ Liệt kê: Hiển thị danh sách khách hàng, tên khách hàng.

- Quản lý Xe
+ Chức năng: Thêm, sửa, xóa thông tin xe (bao gồm mã xe, tên xe, hãng xe, giá, số lượng, trạng thái).
+ Liệt kê: Hiển thị danh sách xe, có thể lọc theo hãng xe hoặc trạng thái (còn/hết hàng).

- Quản lý Đơn đặt cọc
+ Chức năng: Thêm, sửa, xóa đơn đặt cọc.
+ Gán khách hàng cho xe: Cho phép gán một khách hàng cụ thể cho một xe trong đơn đặt cọc.

- Dữ liệu được lưu trữ dưới dạng file nhị phân.
+ Các lớp liên quan (KhachHang, Xe, DonDatCoc) được thiết kế để đọc và ghi dữ liệu từ/đến một hoặc nhiều file nhị phân.

- Trong bộ nhớ, dữ liệu được lưu trữ dưới dạng Collection (ví dụ: ArrayList cho danh sách khách hàng/xe, Map để ánh xạ khách hàng với đơn đặt cọc).
- Chức năng bổ sung (tùy chọn):
+ Tìm kiếm xe theo giá hoặc số lượng.
+ Thống kê số lượng đơn đặt cọc theo trạng thái (đã hoàn thành/chưa hoàn thành).
### UML DIAGRAM
##### CLASS DIAGRAM 
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/Bi%E1%BB%83u%20%C4%91%E1%BB%93%20kh%C3%B4ng%20c%C3%B3%20ti%C3%AAu%20%C4%91%E1%BB%81.drawio.png)
##### SEQUENCE DIAGRAM
![image](https://github.com/htrsng/OOP_N01_Term3_2025_K17_Group2/blob/main/img/sequediagram%20(1).png)
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

|         Thành viên     |         Mã sinh viên    |        
|------------------------|-------------------------|
| Nguyễn Thị Huyền Trang |        23010181         | 
| Đặng Đắc Tú            |  23010619               |
| Lưu Quang Dũng         |   23010665              |

  ## Phân chia công việc: 

|         Thành viên     |         Phân công                      |        
|------------------------|----------------------------------------|
| Nguyễn Thị Huyền Trang | Khởi tạo dự án, Quản lý xe             | 
| Đặng Đắc Tú            | Liên kết Dữ Liệu, Quản lý khách hàng   |
| Lưu Quang Dũng         | Xuất hóa đơn, Quản lý đơn hàng         |


