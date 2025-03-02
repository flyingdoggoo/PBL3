Folder structure

PBL3_flight-booking/
│── src/
│   ├── main/
│   │   ├── java/com/flightbooking/
│   │   │   ├── controller/         # Chứa Servlet xử lý request
│   │   │   ├── model/              # Chứa các lớp Java đại diện dữ liệu
│   │   │   ├── dao/                # Chứa các lớp truy vấn database
│   │   │   ├── service/            # Chứa logic nghiệp vụ
│   │   │   ├── utils/              # Chứa helper class, kết nối DB
│   ├── webapp/
│   │   ├── css/                    # Chứa file CSS
│   │   ├── js/                     # Chứa JavaScript
│   │   ├── images/                 # Chứa ảnh giao diện
│   │   ├── pages/                  # Chứa các trang HTML
│   │   ├── index.html               # Trang chính
│   │   ├── WEB-INF/
│   │   │   ├── views/              # Chứa JSP file nếu dùng
│   │   │   ├── web.xml             # Cấu hình servlet
│── .gitignore
│── pom.xml                          # Nếu dùng Maven
│── README.md
