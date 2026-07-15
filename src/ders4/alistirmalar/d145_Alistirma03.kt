package ders4.alistirmalar

fun main() {
    print("Lütfen Notunuzu Girin: ")
    val kullaniciNot =readln().toDoubleOrNull()
    val durum =
        if (kullaniciNot == null || kullaniciNot > 100 ||kullaniciNot<0){
            "Lütfen sadece geçerli bir rakam giriniz"
        }else if (kullaniciNot>=85){
            "Geçtiniz ve takdir aldınız!"
        }else if (kullaniciNot >= 70){
            "Geçtiniz ve teşekkür aldınız"
        }else if (kullaniciNot >= 50){
            "Geçtiniz"
        }else{
            "Kaldınız"
        }
println(durum)
}