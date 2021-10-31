package Function

fun main(){
    val user = functionUser("Bagus", 20)

    println(user)
    procedureUser("Bayu")

    val userQuick = functionQuick("Lisa", 17)
    println(userQuick)

}

// Method : 2 jenis
/*
*  - Fungsi (Function) = memiliki tipe data dan mengembalikan nilai
*  - Prosedur (Procedure) = jalan ampe selesai tidak mengembalikan nilai
* */

//Prosedur
fun procedureUser(name: String){
    println("Kimi no nawa $name")
}

//Fungsi
fun functionUser(name : String, age : Int) : String{ //fun _namafungsi_ (_parameter) : _tipedataDariFungsi
    val output = "Kimi no nawa $name desu, $age sai desu"
    return output
}

//Fungsi penulisan cepat
fun functionQuick(name: String, age: Int) = "Your name is $name, $age years old"

