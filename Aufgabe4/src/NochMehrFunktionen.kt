fun main() {
    printCity("Berlin")
    printCity("Duisburg")
    printCity("Frankfurt")
}

fun printCity(cityName: String){
    var cityList: MutableList<String> = mutableListOf("Köln", "Hamburg")
    cityList.add(cityName)
    println(cityList)
}