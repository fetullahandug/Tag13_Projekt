// Behebe die Compiler-Fehler, sodass der Code ausgeführt werden kann und die Ergebnisse ausgegeben werden.
// Achte darauf, wie die Funktionen geschrieben sind.
fun main() {
    fehler1(4, 5)
    fehler2(5)
    fehler3(7.0)
    fehler4(5, "Hallo Welt", 7)
}

fun fehler1(zahl1: Int, zahl2: Int) {
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 * zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 40 ausgegeben werden.
}

fun fehler2(zahl2: Int) {
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 / zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 2 ausgegeben werden.
}

fun fehler3(zahl2: Double) {
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 / zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 2 ausgegeben werden.
}

fun fehler4(zahl1: Int, text: String, zahl2: Int) {
    var zahl1: Int = 10             // Diese Zeile darf nicht verändert werden.
    println(text + (zahl1 / zahl2)) // Diese Zeile darf nicht verändert werden. Hier sollte "Hallo Welt 2" ausgegeben werden.
}