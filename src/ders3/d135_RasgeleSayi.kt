package ders3

fun main() {
    val sansliSayi = (1..100).random()
    print("sayı girin:")
    val kullaniciSayi = readln()

    if (kullaniciSayi.equals(sansliSayi))
        println("doğru tahmin")
    else
        println("Yanlış tahmin, sayı $sansliSayi")
}