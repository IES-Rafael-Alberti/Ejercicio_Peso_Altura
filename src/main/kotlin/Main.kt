class Persona(var peso: Double, var altura: Double) {

    init {
        require(peso > 0 && altura > 0) { "El peso y la altura deben ser mayores que 0" }
    }
    var nombre: String=""
    val imc:Double=this.peso/this.altura

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura){
        this.nombre=nombre
        this.peso=peso
        this.altura=altura
    }

    override fun toString(): String {
        return "Persona(peso=$peso, altura=$altura, nombre='$nombre', imc=$imc)"
    }


}

fun main(args: Array<String>) {
    val p1=Persona(75.0, 1.80)
    val p2=Persona("Juan", 70.0,1.75)
    val p3=Persona("María", 67.30, 1.68)

    println(p1)
    println(p2)
    println(p3)

    print("Ingrese el nuevo nombre para la Persona 1: ")
    val nuevoNombre = readln()!!
    p1.nombre = nuevoNombre

    println("Datos de la persona 3")
    println(p3.nombre)
    println(p3.peso)
    println(p3.altura)
    println(p3.imc)

    print("Ingresa la nueva altura de la persona 3: ")
    var nuevaAltura=readln().toDouble()!!
    p3.altura=nuevaAltura

    println(p3.peso)
    println(p3.altura)
    println(p3.imc)

    p2.altura=p3.altura
    p2.toString()
    p3.toString()







}