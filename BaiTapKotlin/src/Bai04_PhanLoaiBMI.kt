// Họ tên: Lưu Tuấn Huê, MSSV: 25810021
fun main() {
    val nang : Double = 70.1
    val cao: Double = 1.82
    var bmi = nang / (cao * cao)
    var phanLoai : String = ""
    if (bmi < 18.5) {
        phanLoai = "Thiếu Cân"
    }
    else if (bmi < 25.0) {
        phanLoai = "Bình Thường"
    }
    else if(bmi < 30.0) {
        phanLoai = "Thừa Cân"
    }
    else {
        phanLoai = "Béo Phì"
    }

    println("Chỉ số BMI của bạn là: $bmi")
    println("Phân Loại: $phanLoai")
}