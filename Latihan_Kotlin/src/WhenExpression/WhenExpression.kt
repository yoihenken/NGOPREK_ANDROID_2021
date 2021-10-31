package WhenExpression

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)

//    val value =  20
//
//    when(value){
//        6 -> println("value is 6")
//        7 -> println("value is 7")
//        8 -> println("value is 8")
//        else -> println("Value cannt be reach")
//    }

    println("----> Menu Calc <----")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    print("Masukkan Input\t: ")
    val input = scanner.nextInt() //input pilihan

    print("Masukkan bilangan pertama\t: ")
    val bil1 = scanner.nextInt() //input bilangan 1

    print("Masukkan bilangan kedua\t: ")
    val bil2 = scanner.nextInt() //input bilangan 2

    when(input){ //Memilih jalur sesuai dari nilai input
        1 -> println("Hasil Penjumlahan\t= ${bil1 + bil2}")
        2 -> println("Hasil Pengurangan\t= ${bil1 - bil2}")
        3 -> println("Gada pilihan!!!")
    }
    //--------------------------
    val valueRange = 27
    val ranges = 10..50

    when(valueRange){ //check kisarannya
        in ranges -> println("value ada di dalam range")
        !in ranges -> println("value tidak ada di dalam range")
        !in ranges -> println("value tidak diketahui")
    }
    //--------------------------
    val variable : Any = 23
    when(variable){ // untuk deteksi tipe data apa
        is Int -> println("Its an integer")
        is Char -> println("Its an char")
        is Double -> println("Its an double")
        else -> println("unknown")
    }
    //--------------------------
    val angka = Random().nextInt(10) - 5
    when {
        angka < 0 -> {
            println("Negative")
            println("value")
        }
        angka == 0 -> {
            println("Zero")
            println("value")
        }
        angka > 0 -> {
            println("Positive")
            println("value")
        }
        else -> println("undefined")
    }







}