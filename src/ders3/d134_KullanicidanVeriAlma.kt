package ders3

fun main() {
    print("Adını gir: ")
    val kullaniciAd = readln()//string

    print("Kilonu gir: ")
    val dunyaKilo = readln().toDouble()//toDouble ile string'ten double'a dönüştürür

    println("Kullanıcı adı: $kullaniciAd, dünyadaki kilonuz: $dunyaKilo kg")
    val marsKilosu = dunyaKilo * 0.38

    val formatliMarsKilosu = "%.2f".format(marsKilosu)
    print("Marstaki kilonuz: $marsKilosu")
}