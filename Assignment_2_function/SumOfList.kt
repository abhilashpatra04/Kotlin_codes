package `Assignment_2(function)`

fun main(){
    val list = listOf(1,2,3,4,5,6)
    val sum = list.sum()
    println(sum)

}
fun sumof(list:List<Int>):Int{
    var s=0
    for (i in list){
        s=s+i
    }
    return s

}