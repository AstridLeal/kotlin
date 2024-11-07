fun letter_count(x: Char, y:String): Int{
    var z = 0
    for(x in y){
        z++
    }
    return z
}

fun main(args: Array<String>){
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}