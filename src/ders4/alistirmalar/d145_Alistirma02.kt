package ders4.alistirmalar

fun main() {
    val not = 56
    val durum =
        if (not>= 85){
            "Tebrikler Takdir Aldınız"
        }else if (not>=50){
           "Dersten geçtiniz"
        }else{
            "Dersten kaldınız"
        }

    println(durum)
}