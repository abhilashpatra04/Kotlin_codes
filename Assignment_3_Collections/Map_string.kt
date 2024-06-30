package Assignment_3_Collections

fun stringsToLengthMap(strings: List<String>): Map<String, Int> {
    val lengthMap = mutableMapOf<String, Int>()
    for (string in strings) {
        lengthMap[string] = string.length
    }
    return lengthMap
}

fun main() {
    val strings = listOf("apple", "banana", "cherry", "date")
    val lengthMap = stringsToLengthMap(strings)
    println("Strings to lengths map: $lengthMap")
}
