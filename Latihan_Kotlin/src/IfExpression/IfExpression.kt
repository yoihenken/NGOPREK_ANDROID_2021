package IfExpression

fun main(){

    val lapar = false
    if (lapar){
        println("Saya lapar dan akan makan !")
    }else{
        println("Saya tidak makan")
    }

    val openHours = 7
    val now = 7

    println("Ofice ${if (now > openHours) "already close" else "is open" }")

    //if langsung return ke variabel
    val office = if (now > openHours){
                    "Kantin buka"
                } else if (now == openHours){
                    "Mohon tunggu, kantin sedang disiapkan"
                } else {
                    "Kantin tutup"
                }
    print(office)


    //return memanggil variabel
    var office2 : String

    if (now > openHours){
        office2 = "Kantin buka"
    } else if (now == openHours){
        office2 = "Mohon tunggu, kantin sedang disiapkan"
    } else {
        office2 = "Kantin tutup"
    }

    print(office2)


}