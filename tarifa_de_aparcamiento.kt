// las primeras 5 hrs se facturas a 1 dólar c/hr
// después, cada hora se factura a 0.5 dólares c/hr
// por cada 24 hrs, hay una tarifa plana de 15 dólares

fun main(args: Array<String>){
    var hours=readLine()!!.toInt()
    var total: Double=0.0
    var cantidad: Double=0.0
    var residuo: Int=0
    if(hours<=5){
        total=hours.toDouble()*1;
        }
        if (hours>5 && hours<24){
            total=((hours.toDouble()-5)*0.5)+5;
        }
        if(hours>5 && hours==24){
            total=((hours.toDouble()-24)*0.5)+15;
        }
        if(hours>5 && hours>24){
        residuo = (hours/24)
        cantidad =(residuo*24).toDouble();
        total = ((hours - cantidad) *0.5)+(residuo.toDouble() *15);
        }
    println(total)
}