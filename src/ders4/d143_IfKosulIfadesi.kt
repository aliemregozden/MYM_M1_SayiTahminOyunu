package ders4

fun main() {
    print("Yaşınızı girin (LÜTFEN SADECE RAKAKM KULLANIN): ")
    val yas = readln().toIntOrNull()


    if (yas == null){
        println("HATA: Lütfen sadece rakam kullanarak geçerli bir rakam girin")
    }else if (yas<18){
       println("Reşit değilsiniz işleme devam edemezsiniz")
    }else{
        println("Reşitsiniz işleme devam edebilirsiniz")
    }
}