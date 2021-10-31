package Hello

fun main(){
    //Deklarasi Variabel
    val variable1 = 1.0 //Menampung data static (tidak dapat dirubah)
    var variable2 = 5 //Menampung data dinamik (dapat dirubah)

    val variabelString1 : String //variabel dengan deklarasi tipedata
    var variabelString2 : String = "Saya Bagus" //variabel dengan deklarasi tipedata

    var variableString = "A"
    var variableChar = 'A'
    var variableDouble = 1.0
    var variableBoolean = false

    //Print
    println("Nilai dari variable = " + variableBoolean + " dengan tipe data Boolean")
    println(" Nilai dari variable\t = $variableString dengan tipe data String ")

    println("Penjumlahan " + (variable1 + variable2))
    println("Penjumlahan ${variable1 + variable2}")

}