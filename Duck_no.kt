import java.util.*
fun isDuckNumber(n: Int): Boolean {
    val s = n.toString()
    val len = s.length
    var h = false

    for (i in 1 until len) {
        if (s[i] == '0') {
            h = true
            break
        }
    }

    return h && s[0] != '0'
}

fun main() {
    val read = Scanner(System.`in`)
    println("Enter a no.:")
    val n = read.nextInt()
    if (isDuckNumber(n)) {
        println("It is a Duck Number")
    } else {
        println("It is not a Duck Number")
    }
}
