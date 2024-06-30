package Assignment_3_nullsafety

fun getStringLength(s: String?): Int {
    return s?.length ?: -1
}

fun main() {
    val s1: String? = "Abhilash"
    val s2: String? = null

    println(getStringLength(s1))
    println(getStringLength(s2))
}
