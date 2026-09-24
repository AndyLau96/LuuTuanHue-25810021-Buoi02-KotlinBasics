// Họ tên: Lưu Tuấn Huê, MSSV: 25810021
fun main() {
    val bookNames: MutableList<String> =mutableListOf("Một Cơn Gió Bụi", "Con Rồng Việt Nam", "Trại Súc Vật", "Giải Khăn Sô Cho Huế", "Sherlock Holmes")
    println(bookNames)
    bookNames.add("Cuộc Đấu Tranh Của Tôi")
    bookNames.add("Vang Bóng Một Thời")
    bookNames.remove("Sherlock Holmes")
    bookNames.sort()
    println(bookNames)
}