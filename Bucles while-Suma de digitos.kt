fun main(args: Array<String>){
    var num=readLine()!!.toInt()
    var sum=0
    var x=0
    while (num!=0){
	    x=num%10
        num=num/10
        sum+=x
    }
    println(sum)
}