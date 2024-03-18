//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /*var array = arrayOf("Luis", "Mario")
    println("Arreglo antes de sumar: $array")
    array+="Luis"
    println("Arreglo despues de sumar: $array")
    array[0] = "Jorge"
    println(array.contentToString())

    var list = listOf("Pizza","Taco")
    //list[0] = "Empanada"
    println("Lista antes de sumar: $list")
    list+="Queso"
    println("Lista despues de sumar: $list")
    println(list)
    var numbers = intArrayOf(2,2,5,7,8,8,3,5,6)
    val duplicates = numbers.groupBy { it }.filter { it.value.size > 1 }.keys
    print(duplicates)*/

    /*val list  = listOf(1,2,3,4,5)
    list.forEach{
        println(it)
    }
    list.forEachIndexed{index, elemento -> println("Posicion $index del valor $elemento") }*/
    //filter()
    //map()
    reduce()
}

fun filter(){
    val nombres = listOf("Luis","Maria","Pedro")
    val nombresRes = nombres.filter { it.contains("a",ignoreCase = true) }
    println(nombresRes)

    val personas = listOf(
        Persona("Maria",30),
        Persona("Juan",40),
        Persona("John",31),
        Persona("Mario",32),
        Persona("Octo",53),
        Persona("Adam",60)
    )
    val mayores = personas.filter { it.edad > 30 }.map { it.nombre }.sorted()
    println(mayores)
}

fun map(){
    val personas = listOf(
        Persona("Maria",30),
        Persona("Juan",40),
        Persona("John",31),
        Persona("Mario",32),
        Persona("Octo",53),
        Persona("Adam",60)
    )
    val listPersonas = personas.map { it.nombre }
    println(listPersonas)
    val mul = personas.map { it.edad * 2 }
    println(mul)

    val sum = personas.map { it.edad }.sum()
    println(sum)

    val palabras = listOf("hola","mundo","kotlin")
    val sumaPalabras = palabras.map { it.length }
    println(sumaPalabras)
}

fun reduce(){
    val num = listOf(1, 2, 3, 4, 5)
    val numRes = num.reduce{ valorAcumulado, valorActual -> valorAcumulado*valorActual}
    println(numRes)


    val words = listOf("hola","mundo","kotlin")
    val concat = words.reduce { va, v -> "$va $v" }
    println(concat)

}

data class Persona(val nombre:String, val edad:Int)