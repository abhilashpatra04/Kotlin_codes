package Assignment_3_nullsafety

data class User(val name: String?, val email: String?)

fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("User(name=${user.name}, email=${user.email})")
    }
}

fun main() {
    val user1 = User("Abhilash", "abhilashpatra2004@gmail.com")
    val user2 = User(null, "bay@gmail.com")
    val user3 = User("Ram", null)

    printUserDetails(user1)
    printUserDetails(user2)
    printUserDetails(user3)
}
