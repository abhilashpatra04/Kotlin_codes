package Assignment_3_Collections

fun filterList(numbers: List<Int>, n: Int): List<Int> {
    val filteredList = mutableListOf<Int>()
    for (number in numbers) {
        if (number >= n) {
            filteredList.add(number)
        }
    }
    return filteredList
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val n = 3
    val filtered = filterList(numbers, n)
    println("Original list: $numbers")
    println("Filtered list : $filtered")
}
