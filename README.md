
# Bài tap ve nha _ NHOM2

## Câu 1 . Tiêu đề 
**Quản lý cửa hàng xe**

## Câu 2 . Phân tích cơ sở ít nhất 03 đối tượng
1. **Khách hàng**: quản lý thông tin khách mua xe gồm : mã đơn, tên khách, số điện thoại , mã xe .

2. **Sản phẩm (Xe)**: quản lý các sản phẩm có trong cửa hàng : mã sản phẩm, tên , hãng , giá , số lượng trong kho , tình trang (còn /hết) .

3. **Đơn đặt cọc**: quản lý các đơn đặt xe + đặt cọc : mã đơn, thông tin khách , sản phẩm , ngày đặt , ngày hẹn lấy , tiền cọc , trạng thái đặt (đã /chưa).

## Câu 3 . xây dựng cấu trúc folder của Project
 Đã hoàn thành 

## Câu 4. Các class đã tạo:
1. KhachHang.java
2.  Xe.java
3.  DonDatCoc.java
4. KhachHangTest.java
5. XeTest.java
6.  DonDatCocTest.java

## Câu 5. Các class kiểm định:
- KhachHangTest.java
- XeTest.java
- DonDatCocTest.java


# Bài tap UML
- Thành viên :
1. Nguyễn Thị Huyền Trang
ID : 23010181
chữ ký : Trang

2. Đặng Đắc Tú
ID : 23010619
chữ kí : Tú

3. Lưu Quang Dũng
ID : 23010665
chữ kí : Dũng



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
- Sơ đồ Behavioural Diagram của bài tập lớn
 <img src="img/Untitled(2).png" alt="UML Diagram" width="600">

- Nội dung 04:
Cập nhật code cho CRUD (create/read/update/delete)  và chạy kiểm định (test) cho ít nhất 03 đối tượng trong bài tập lớn (đã hoàn thành)
