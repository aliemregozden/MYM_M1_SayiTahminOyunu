package ders4

fun main() {
    /*
    Alışveriş uygulamanızın indirim sistemini kodlayalım ve
    kullanıcı hatalarına karşı koruyalım:

    readln().toIntOrNull() ile kullanıcıdan “Sepet Tutarını” girmesini isteyin.
    İlk if bloğunda girilen değerin null olup olmadığını kontrol edin.
     null ise “Lütfen sayı girin” uyarısı verin.
    else if ile tutar 500 ve üzerindeyse “Süper Fırsat! %20 İndirim Kazandınız” yazdırın.
    Başka bir else if ile tutar 200 ve 500 arasındaysa “Kargo Bedava!” yazdırın.
    Kalan durumlar için else bloğunda “İndirim için ürün eklemeye devam edin” yazdırın.
    Kodu çalıştırıp önce harf, sonra 600, sonra 300 girerek tüm yolları (dalları) test edin.
     */

    print("Sepet tutarı girin: ")
    val tutar = readln().toDoubleOrNull()

    if (tutar == null){
        println("Lütfen tutarı sayısal bir değer olarak450 giriniz")
    }else if (tutar>= 500){
        println("%20 indirim")
    }else if (tutar >= 200){
        println("kargo bedava")
    }else{
        println("sepete ürün eklemeye devam edin")
    }


}