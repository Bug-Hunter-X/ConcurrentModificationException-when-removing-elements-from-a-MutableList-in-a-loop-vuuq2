```kotlin
fun main() {
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        val i = iterator.next()
        if (i > 2) {
            iterator.remove()
        }
    }
    println("Solution 1: "+list2) // Output: [1, 2]

    // Solution 2: Create a new list
    val newList = list2.filter { it <= 2 }
    println("Solution 2: "+newList) // Output: [1, 2]

    //Solution 3: Using removeIf
    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    list3.removeIf { it > 2 }
    println("Solution 3: "+list3) // Output: [1, 2]
}
```