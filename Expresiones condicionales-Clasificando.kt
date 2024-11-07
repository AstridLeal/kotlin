// child: 0-11
// teen: 12-17
// adult:18-64
// senior: 65+
// En caso de que la edad sea negativa, hay que generar "Invalid age"

fun main(args: Array<String>){
    var age=readLine()!!.toInt()
    val result = when {
        age>=0 && age<=11 -> "Child"
        age>=12 && age<=17 -> "Teen"
        age>=18 && age<=64 -> "Adult"
        age>=65 -> "Senior"
	    else -> "Invalid age"
    }
    prinln(result)
}