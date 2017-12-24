fun main(args: Array<String>) {
    // `var` keyword is how variables are declared in Kotlin
    // Java equilavent would be: `int x = 3;`
    // Also, in Kotlin semicolons are optional, we can just omit them.
    var x: Int = 3

    // `val` keyword is used to declare `final` variables, these variables can't be reassigned another object
    // once they are initialized. Sounds familiar? Java equilavent would be: `final String y = "Hello";`
    val y: String = "Hello"

    // Kotlin compiler is quite smart, which means it can figure out some
    // things without us telling them
    // Here, we didn't need to declare the type of variable `bigNumber` as we already assign a long literal
    // Kotlin can figure out that `bigNumber`s type is Long, so we can just remove the type
    var bigNumber = 30000000L

    // Same works with `val` keyword too!
    val presidents1 = listOf<String>("Erdoğan", "Gül", "Sezer")

    // Actually, we just said Kotlin is smart, let's drop the generic type too
    val presidents2 = listOf("Erdoğan", "Gül", "Sezer")

    // What if we want to just declare a variable to use it later? Let's try it.
    var s1: String = null
    // This won't compile, as Kotlin has a concept called `non-nullable` types, all the variables we have declared
    // so far are non-nullable, meaning they can't be assigned any value that could possibly be null

    // So if we want to declare a variable `nullable`, we just need to add a question mark after the type
    var s2: String? = null
    // As much as Kotlin allows you to use nullable types, the compiler will still do checks to see if the developer
    // is checking nullness of such variables, preventing NullPointerExceptions in runtime

    // Kotlin compiler will not let you do this, as accessing length property of the variable `s2` isn't safe as it can be null
    println(s2.length)

    // Kotlin is fine with this line because we are taking necessary precautions
    if (s2 != null) println(s2.length)
}