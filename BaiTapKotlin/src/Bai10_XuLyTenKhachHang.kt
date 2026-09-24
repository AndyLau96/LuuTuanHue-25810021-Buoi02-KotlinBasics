// Họ tên: Lưu Tuấn Huê, MSSV: 25810021
fun xuLyTenKhachHang(tenKhachHang: String?) {
    val doDaiTen: Int? = tenKhachHang?.length
    println("Độ dài tên khách hàng (Safe Call): $doDaiTen")
    val tenCuoiCung: String = tenKhachHang ?: "Khách vãng lai"
    println("Tên sau khi xử lý (Elvis): $tenCuoiCung")
}

fun main() {
    val tenKhongXacDinh: String? = null
    xuLyTenKhachHang(tenKhongXacDinh)
    val tenHopLe: String? = "Lưu Tuấn Huê"
    xuLyTenKhachHang(tenHopLe)
    /*
     giải thích về toán tử: toán tử !! ép trình biên dịch phải coi biến này là chắc chắn không rỗng.
     nếu biến đó null khi chương trình đang chạy, sẽ ném ra lỗi 'NullPointerException' và làm crash.
     */
    val doDaiBatBuoc: Int = tenHopLe!!.length
    println("Độ dài toán tử !! là: $doDaiBatBuoc")
}