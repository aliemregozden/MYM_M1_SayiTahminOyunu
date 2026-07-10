package ders3

fun main() {
    var sepetTutari = 123.2

    sepetTutari -= sepetTutari * 0.15
    println("Sepet tutarı: $sepetTutari")

    sepetTutari += 55
    println("Sepet tutarı(Kargo dahil): $sepetTutari")
}