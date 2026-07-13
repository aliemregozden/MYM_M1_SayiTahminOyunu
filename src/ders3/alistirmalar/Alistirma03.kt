package ders3.alistirmalar

fun main() {
    print("sepet tutarını girin: ")
    var sepetTutar = readln().toDouble()

    val indirimYuzdesi = (10..50).random()

    val indirimliTutar = sepetTutar * indirimYuzdesi / 100
    sepetTutar -= indirimliTutar

    println("çarktan %$indirimYuzdesi inidirim yüzdesi kazandınız, yeni sepet tutarı: $sepetTutar")

}