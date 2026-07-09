package ders2.alistirmalar

fun main() {
    /*
    Yaşadığınız şehrin adını, anlık sıcaklığını ve nem oranını değişkenlere atayın.
     Bu atamaları yaparken tipleri açıkça yazmayın, bırakın Kotlin otomatik algılasın.
     Ancak, klimaların ulaşmasını istediğiniz “hedef sıcaklık” değerini tanımlarken, tipin kesinlikle
     Double olmasını sağlamak için tipi (: Double) olarak açıkça belirtin.
     */
val sehirAdi = "Çanakkale"
    val nemOrani = 23.5
     val klimaDeger : Double  = 21.1

    println("""
        şehir adı: $sehirAdi
        nem Oranı: $nemOrani
        klima değeri $klimaDeger C
    """.trimIndent())
}