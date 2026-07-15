package ders4.alistirmalar

fun main() {
    val yas = 19
    val egitimTamam = true
    val kayitOlabilirMi =yas >= 18 && egitimTamam

    if (kayitOlabilirMi){
        println("Kayıt işlemi tamam")
    }else{
        println("Kayıt olunamıyor")
    }
}