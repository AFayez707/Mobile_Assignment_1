fun main(){
    var planetName = listOf("Venus", "Mars", "Jupiter", "Saturn", "Uranus","Neptune")
    println("Enter you weight in pounds")
    var weight = readLine()!!.toDouble()
    println("Choose planet number")
    var planet = readLine()!!.toInt()

    val weightOnPlanet = when(planet){
        1 -> weight * 0.78
        2 -> weight * 0.39
        3 -> weight * 2.65
        4 -> weight * 1.17
        5 -> weight * 1.05
        6 -> weight * 1.23
        else -> 0.0
    }
    print("Your weight on $planet is $weightOnPlanet")
}