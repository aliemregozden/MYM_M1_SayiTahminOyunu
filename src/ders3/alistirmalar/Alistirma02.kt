package ders3.alistirmalar

fun main() {
    print("Lütfen yaşadığınız şehri girin: ")
    val sehir = readln()

    print("Bugünün en düşük sıcaklığını girin: ")
    val dusukSicaklik = readln().toDouble()

    print("Bugünün en yüksek sıcaklığını girin: ")
    val yuksekSicaklik = readln().toDouble()

    val ortalama = (dusukSicaklik+yuksekSicaklik)/2
    println("$sehir şehrinde bugün sıcaklık değerleri $dusukSicaklik ile $yuksekSicaklik arasında değişecektir, bugünün sıcaklık ortalaması $ortalama")
}