package `Assignment_2(function)`

fun main(){
    val num = larger(10,15)
    println("The larger number is $num.")
}

fun larger(a:Int, b:Int):Int{
    if(a>b){
        return a
    }
    else if(b>a){
        return b
    }
    else{
        return 1
    }
}
