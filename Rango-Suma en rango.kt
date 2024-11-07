fun main(args: Array<String>){
    var x=readLine()!!.toInt()
    var y=readLine()!!.toInt()
    var suma=0;
	while (x<=y) {
		suma=suma+x
        x=x+1
	}
    println(suma)
}
