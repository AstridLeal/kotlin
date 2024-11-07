// programa que abre/cierra puerta en funcion de la hora del dia

fun main(args: Array<String>){
    var hour=readLine()!!.toInt()
    if (hour<=18){
        println("Open")
    }
    else {
        println("Closed")
    }
}