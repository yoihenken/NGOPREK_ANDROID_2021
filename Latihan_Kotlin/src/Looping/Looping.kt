package Looping

import java.util.*

fun main(){
    //While (untuk perulahan berdasarkan kondisi)

    //While..do
    var counterWhl = 0
    while (counterWhl <= 7){ //Perulangan ascending
        println("Hasil counter While..Do\t: $counterWhl")
        counterWhl++
    }

    //Do..While
    var counterDo = 10
    do{ //perulangan descending
        println("Hasil counter Do..While\t: $counterDo")
        counterDo--
    }while (counterDo > 0)

    //-------------------------------------
    var scanner = Scanner(System.`in`)

    val username = "henken"
    val pass = "yoi"

    var usernameInput: String = ""
    var passInput: String = ""

    while (!username.equals(usernameInput) && !pass.equals(passInput)){
        print("Username\t: ")
        usernameInput = scanner.next()
        print("Pass\t: ")
        passInput = scanner.next()
    }
    println("Login Berhasil!!!")


    //For each (untuk menampilkan isi array / memanipulasi isi array)

    val ranges = 1.rangeTo(10)
    for (i in ranges){
        println("value is $i")
    }


}