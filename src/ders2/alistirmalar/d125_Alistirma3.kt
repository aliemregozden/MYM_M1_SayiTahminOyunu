package ders2.alistirmalar

fun main() {
    /*
    Mini Market Otomasyonu: Tek bir alışveriş kalemini modelleyin. Ürün adı (String), alınacak adet (Int),
     birim fiyat (Double) ve ürünün stokta olup olmadığı (Boolean)
    bilgilerini değişkenlere atayın. Adet ile birim fiyatı çarparak ara toplamı hesaplayın ve tüm bu
    bilgileri konsola düzenli bir şekilde yazdırın.
     */
    val urunAdi = "süt"
    val adet = 4
    val birimFiyat = 6.7
    val stoktaVarMi = true

    val araToplam = adet * birimFiyat
    println("----------ALIŞVERİŞ SEPETİ----------")
    println("ürün adı: $urunAdi")
    println("Adet: $adet")
    println("birim Fiyat: $birimFiyat")
    println("stok durumu: $stoktaVarMi")
    println("Toplam fiyat: $araToplam")
}