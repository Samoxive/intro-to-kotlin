// This is how functions are defined in Kotlin
// It's pretty close to Java syntax
fun sum(x: Int, y: Int): Int {
    return x + y
}

// You can also use a shortcut when defining functions if it's one line long
fun sum1(x: Int, y: Int) = x + y

// Functions can also be passed to other functions
fun callFunctionWith2And3(func: (x: Int, y: Int) -> Int) = func(2, 3)

fun main(args: Array<String>) {
    // Functions can be created inline, these functions are called `lambda`s.
    val a = { x: Int, y: Int -> x + y }
    // Will print 2 + 3 = 5
    println(callFunctionWith2And3(a))

    // For functions that take a function as a parameter, we can use this shortcut to define lambdas for them
    val result = callFunctionWith2And3 { x, y ->
        val k = 2 * x
        val l = 2 * y
        k + l
    }
    // Will print (2 * 2) + (2 * 3) = 10
    println(result)
}