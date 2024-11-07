fun main(args: Array<String>){
    val names=arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    var day=readLine()!!.toInt()
    if(day<=6){
        println(names[day])
    } else {
        println("Invalid day")
    }
}