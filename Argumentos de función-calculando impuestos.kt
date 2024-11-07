fun calc(x: Double){
    impuesto=x*15%
    println(impuesto)
}

fun main(args: Array<String>){
    val price = readLine()!!.toDouble()
    calc(price)
}