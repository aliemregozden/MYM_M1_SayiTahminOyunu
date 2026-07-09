package ders2.alistirmalar

fun main() {
    /*
    Market sepeti senaryonuzu geliştirin. Sepet tutarını tutan değişkeni var ile tanımlayın.
    Kullanıcının sepete yeni ürünler eklediğini varsayarak, sepet tutarını kod içinde iki kez güncelleyin (örneğin önce 50 TL, sonra 30 TL daha ekleyin).
     Her güncellemeden sonra yeni toplamı konsola yazdırın. Konsol çıktınızda en az
     üç farklı tutar satırı görmelisiniz. Bu, ileride modern ekran arayüzlerinin nasıl dinamik olarak güncelleneceğinin (Recomposition) temel mantığıdır!
     */
    val urunAdi = "süt"
    val adet = 4
    val birimFiyat = 6.7
    val stoktaVarMi = true
    var araToplam = adet * birimFiyat

    println("""
        urun adı: $urunAdi
        adet: $adet
        birim fiyat: $birimFiyat
        stok durumu: $stoktaVarMi
        ara toplam:  $araToplam
    """.trimIndent())
araToplam +=34
    println("Güncel toplam : $araToplam")
araToplam +=54
println("Güncel toplam : $araToplam")
}