# ConcurrentModificationException in Kotlin MutableList
This repository demonstrates a common error in Kotlin involving ConcurrentModificationException when removing elements from a MutableList while iterating over it using a standard for loop.
The `bug.kt` file shows the erroneous code, which throws the exception.  The `bugSolution.kt` file shows a corrected approach using iterators or creating a new list.
This example highlights the importance of using appropriate methods for modifying collections during iteration in Kotlin to avoid runtime exceptions.