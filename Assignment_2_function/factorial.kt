package `Assignment_2(function)`

fun main(){
    val num = 5
    val fact = factorial(num)
    println("Factorial of $num is $fact")
}
fun factorial(num:Int):Int{
    return if (num == 0 || num == 1){
        1
    }
    else{
        num*factorial(num-1)
    }
}