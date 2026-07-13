package ders3.alistirmalar

fun main() {
    var ejderhaCani = 1000.0

    println("Kahraman adını girin")
    val kahramanAd = readln()
    println("Saldırı gücünü girin ")
    var saldiriGucu = readln().toDouble()

    val kritikBonus = (10..50).random()
    saldiriGucu += kritikBonus

    ejderhaCani -= saldiriGucu
    val formatliEjderhaCani = "%.2f".format(ejderhaCani)

    println(
        """
      ---*SAVAŞ RAPORU:*--
       
        Kahraman adı: $kahramanAd
        ejderhaya verilen hasar : $saldiriGucu
        kritik hasar : $kritikBonus
        ejderhanın kalan canı : $formatliEjderhaCani
        
      
    """.trimIndent()
    )
}