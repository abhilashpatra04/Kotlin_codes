package `Assignment_2(function)`

fun main(){
    val str = "Madam"
    palindrome(str.lowercase())
}
fun palindrome(str:String){
    var rev = ""
    for (i in str){
        rev = i + rev
    }
    if (rev == str){
        println("The string is a Palindrome")
    }
    else{
        println("The string is not a Palindrome")
    }
}