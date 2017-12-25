// This is how functions are defined in Kotlin
// It's pretty close to Java syntax
fun sum(x: Int, y: Int): Int {
    return x + y
}

// You can also use a shortcut when defining functions if it's one line long
fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    val a = sum
    println(a(1, 2))
}