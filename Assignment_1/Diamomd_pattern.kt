import java.util.*
fun main() {
    val read = Scanner(System.`in`)
    val n = read.nextInt()
    for (i in 1..n) {
        for (j in 1..(n-i)) {
            print("  ")
        }
        for (j in 1..(2*i-1)) {
            print("* ")
        }
        println()
    }
    for (i in 1..n) {
        for (j in 1..i) {
            print("  ")
        }
        for (j in 1..2 * (n - i) - 1) {
            print("* ")
        }
        println()
    }
}