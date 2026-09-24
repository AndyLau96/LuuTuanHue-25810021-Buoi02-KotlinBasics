// Họ tên: Lưu Tuấn Huê, MSSV: 25810021
fun main() {
    val diemSV : Array<Double> = arrayOf(7.5, 8.0, 9.5, 6.0, 4.5, 10.0, 8.5, 5.5, 7.0, 9.0)
    var maxDiem: Double = diemSV[0]
    var minDiem: Double = diemSV[0]
    var tongDiem: Double = 0.0
    for (diem: Double in diemSV) {
        tongDiem += diem
        if(diem > maxDiem) {
            maxDiem = diem
        }
        if(diem < minDiem) {
            minDiem = diem
        }
    }
    val tbDiem: Double = tongDiem / diemSV.size
    println("Điểm trung bình: $tbDiem")
    println("Điểm cao nhất: $maxDiem")
    println("Điểm thấp nhất: $minDiem")
}