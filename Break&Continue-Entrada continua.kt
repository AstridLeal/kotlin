//programa que toma entradas continuas hasta que introduzcas 0 y da como resultado el numero de entradas tomadas antes del 0
fun main(args: Array<String>){
    var contador=0
    while(true){
        var input=readLine()!!.toInt()
        contador=contador+1
        if(input==0){
            break
        }
    }
    println(contador-1)
}