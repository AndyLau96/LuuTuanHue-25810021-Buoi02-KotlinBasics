fun main() {
    var soDauTien: Int = 0
    var soThu2: Int = 1

    println("Index 0: Giá Trị là : $soDauTien")
    println("Index 1: Giá Trị là : $soThu2")

    for (index: Int in 2..100) {
        val soTiepTheo: Int = soDauTien + soThu2
        if (soTiepTheo >= 100) {
            break
        }
        println("Index $index: Giá Trị là : $soTiepTheo")
        soDauTien = soThu2
        soThu2 = soTiepTheo
    }
}