// Họ tên: Lưu Tuấn Huê, MSSV: 25810021
fun main() {
    val diemTBToan: Double = 8.3
    when (diemTBToan) {
        in 0.0..3.5 -> println("Kém")
        in 3.5..5.0 -> println("Yếu")
        in 5.0..6.9 -> println("Trung Bình")
        in 7.0..8.0 -> println("Khá")
        in 8.1..9.0 -> println("Giỏi")
        in 9.1..10.0 -> println("Xất sắc")
    }

}