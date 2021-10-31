package Array

fun main(){
//    print(" 12 | 6 | 0 | 0 | 0  ")

    val doubleArray = doubleArrayOf(1.0, 2.3, 4.1) //array sesuai tipe data double
    val intArray2 = intArrayOf(1,2,3,4) // array sesuai tipe data int
    val charArray = charArrayOf('a', 'A', 'b') // arraty sesuai tipe data char

    val array1 = arrayOf("string1", "String2", "String3") //Array 1 tipe data
    val arrayMixTD = arrayOf("string", 2, 1.0, 'A') // array multi tipe data

    val intArray = Array(4, {i ->
        i  //variabel i akan generate data 0 1 2 3
    })

    val intArray1 = Array(4, {i ->
        i * i //variabel i akan dikalikan dengan i sampai 4 kali
    })

    //menampilkan array
    for (x in intArray){
        print( "$x, ")
    }
    println()

    var elementArray = arrayMixTD[2]
    println(elementArray)
}