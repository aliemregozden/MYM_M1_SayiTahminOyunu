package ders4

fun main() {/*

    IDE’nizde karanlikModAktif adında mantıksal (Boolean) bir değişken oluşturun ve başlangıç değerini true yapın.
if yapısını bir ifade (expression) olarak kullanıp; eğer karanlık mod aktifse siyah renk kodunu ("#000000"), değilse beyaz renk kodunu ("#FFFFFF") doğrudan arkaPlanRengi adında yeni bir değişkene atayın.
Oluşturduğunuz arkaPlanRengi değişkenini ekrana yazdırarak test edin.
Değişkeninizin değerini false olarak değiştirip kodu tekrar çalıştırarak (Run) rengin otomatik olarak beyaza dönüştüğünü gözlemleyin.
     */
    val karanlikModAktif = true
    val arkaplanRenk =
        if (karanlikModAktif){
            "#000000 - Siyah"
        }else{
            "#FFFFFF - Beyaz"
        }

    println("Arkaplan renk kodu: $arkaplanRenk")
}