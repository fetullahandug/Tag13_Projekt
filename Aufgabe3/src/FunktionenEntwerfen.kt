
fun main(){
    var ergebnis = komischeFunktion(25, 40, 100)
    println(ergebnis)
}

//a
fun addition(zahl1: Double, zahl2: Double): Double{
    val ergebnis = zahl1 + zahl2
    return ergebnis
}

//b
fun subtraktion1zu2(zahl1: Int, zahl2: Int): Int{
    val ergebnis: Int = zahl1 - zahl2
    return ergebnis
}

//c
fun komischeFunktion(z1: Int, z2: Int, z3: Int): Double{
    var e1 = z1 * z2
    var eFinal: Double = (e1 - z3).toDouble()
    return eFinal
}