/* Cada día una familia consume 15 lts de agua.
Dado el número de años como entrada, hay que calcular y generar la cantidad de agua consumida en ese periodo.
*/

fun main(args: Array<String>){
    var years=readLine()!!.toInt()
    var water=years*365*15
    println(water)
}