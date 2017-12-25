import java.io.File
import java.util.*

fun main(args: Array<String>) {
    // While loops have the same syntax in Kotlin compared to Java
    var i = 0
    while (i < 5) {
        // This is Kotlin's template literal feature, you can put any variable inside the curly brackets
        // and the variable inside will be placed into the string. Java equilavent is: `"Iteration no: " + i`
        println("Iteration no: ${i}")
        i++
    }

    i = 0
    val s = "Hello world!"
    do {
        // You can also emit the curly brackets if there isn't a method call or field access inside the brackets
        // ${i} is valid, $i is valid, ${s.get(i)} is valid, $s.get(i) is invalid
        println("Index: $i Char: ${s.get(i)}")
        i++
    } while (i < s.length)

    // For loops work differently in Kotlin, only foreach loops are supported.
    // Which means only `for (String elem: stringArray)` style loops are supported.
    val lessons = arrayOf("COMP205", "COMP203", "EE203", "TURK101")
    for (lesson in lessons) {
        println(lesson)
    }

    // If you still need indexes, you can use `indices` property of arrays and lists
    for (index in lessons.indices) {
        println("$index : ${lessons[index]}")
    }

    // You can also make use of ranges to achieve the same code
    for (index in 0..lessons.size) {
        println("$index : ${lessons[index]}")
    }
    val number = 5

    // If statements are also same syntax-wise
    if (number > 0) {
        println("Number is positive")
    } else {
        println("Number is equal to zero or is negative")
    }

    // If blocks in Kotlin are expressions instead of statements, which means they can return values
    // Last expression in each block will be returned
    val isNumberPositive = if (number > 0) {
        println("Number is positive")
        true
    } else {
        println("Number is equal to zero or is negative")
        false
    }

    // When expression in Kotlin is like a switch statement in Java except it's more powerful
    when (number) {
        0 -> println("Number is 0")
        in 1..10 -> println("Number is in range [1, 10)")
        else -> println("Number is negative or is bigger than or equal to 10")
    }

    // Like if blocks, when expression will also return values inside each condition
    val message = when (number) {
        0 -> "Number is 0"
        in 1..10 -> "Number is in range [1, 10)"
        else -> "Number is negative or is bigger than or equal to 10"
    }

    println(message)

    // Try-catch block is also an expression, it will return the last value inside blocks
    val input = try {
        Scanner(File("input.txt")).next()
    } catch (e: java.io.IOException) {
        "Error!"
    }
}