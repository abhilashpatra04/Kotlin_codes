package Assignment_3_Collections

fun isSubset(list1: List<Int>, list2: List<Int>): Boolean {
    return list1.all { it in list2 }
}

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(1, 2, 3, 4, 5)
    println("Is list1 a subset of list2? ${isSubset(list1, list2)}")
}
