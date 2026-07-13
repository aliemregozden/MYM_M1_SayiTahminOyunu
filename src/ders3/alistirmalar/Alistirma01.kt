package ders3.alistirmalar

fun main() {
    println("isim girin")
    val isim = readln()

    println("kilo girin")
    val kilo = readln().toDouble()

    println("boy girin(cm)")
    val boyCm = readln().toDouble()

    val boyM = boyCm / 100
    val vki = kilo / (boyM * boyM)

    val formatliVki = "%.2f".format(vki)
    println("sayın $isim VKİ'niz: $formatliVki")
}