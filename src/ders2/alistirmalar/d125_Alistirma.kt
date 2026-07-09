package ders2.alistirmalar

fun main() {
    /*
    Uygulama Kartı Oluşturma: Yeni bir uygulama geliştirdiğinizi düşünün. val
    anahtar kelimesini kullanarak uygulamanızın adını ve sürüm kodunu (örneğin 1.0)
    tanımlayın. Ardından, günlük aktif kullanıcı sayısını tutacak bir değişkeni var ile
     tanımlayın. Bu sayıyı kodun ilerleyen satırlarında
     artırın ve her artıştan sonra println ile güncel durumu konsola yazdırın.
     */
    val uygulamaAdi = "Notlarim"
val surumKodu = "1.0"

    var kullaniciSayisi = 25
    kullaniciSayisi += 53
    println("Uygulama adı: $uygulamaAdi")
    println("kullaniciSayisi: $kullaniciSayisi")
    println("Sürüm kodu: $surumKodu")

}
