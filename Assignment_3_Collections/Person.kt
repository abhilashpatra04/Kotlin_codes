package Assignment_3_Collections

data class Person(val name: String, val age: Int)
fun sortPersons(persons: List<Person>): List<Person> {
    return persons.sortedWith(compareBy({ it.age }, { it.name }))
}
fun main() {
    val persons = listOf(
        Person("Ram", 25),
        Person("Sham", 30),
        Person("Rohon", 25),
        Person("Sahil", 30),
        Person("DEvi", 20)
    )
    val sortedPersons = sortPersons(persons)
    println("Sorted persons:")
    for (person in sortedPersons) {
        println("${person.name}, ${person.age}")
    }
}
