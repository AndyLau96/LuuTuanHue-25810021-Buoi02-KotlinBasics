// Họ tên: Lưu Tuấn Huê, MSSV: 25810021
fun main() {
    //sử dụng val vì số dư ban đầu là cột mốc tham chiếu không thay đổi
    val soDuBanDau: Double = 5_000_000.00
    //sử dụng var vì biến này sẽ thay đổi khi có giao dịch
    var soDuHienTai: Double = soDuBanDau
    //gd 1
    soDuHienTai += 2_000_000.00
    println("Số dư sau khi được cộng thêm là $soDuHienTai")
    //gd 2
    soDuHienTai -= 1_500_000.00
    println("Số dư sau khi được rút tiền là $soDuHienTai")
}