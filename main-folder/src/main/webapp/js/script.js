import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';


document.querySelector("form").addEventListener("submit", function(e) {
    alert("Đang tìm kiếm chuyến bay...");
});

document.addEventListener("DOMContentLoaded", function() {
    const form = document.querySelector(".booking-form form");
    form.addEventListener("submit", function(event) {
        event.preventDefault();
        alert("Chức năng đang được cập nhật!");
    });
});
