// This syntax is used to define classes, we can specify a constructor right next to the class name
class Point(x: Int, y: Int) {
    val x = x
    val y = y
}
// We can also put fields right into the constructor (they are called properties in Kotlin),
// this allows us to define class fields and assign them in constructor in the same time
class Point1(val x: Int, val y: Int)
// Above code's equivalent in Java:
// class Point {
//     public int x;
//     public int y;
//
//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
// }

// We can create getters and setters for properties in Kotlin right next to the declarations.
// When we define a setter, it will be called when the developer tries to modify it
// `bag.items = listOf("Apple", "Banana")` the setter is going to be called with the value in right hand side of the equation
// Same goes for getters, when we access the property like this: `println(bag.items)`, its getter will be called
class Bag<T>(items: List<T>) {
    var items = items
        get() {
            println("Someone touched the items in the bag!")
            return field
        }
        set(value) {
            field = value
            println("Items in the bag changed!")
        }
}


fun main(args: Array<String>) {
    val p = Point(1, 2)

    val bag = Bag(listOf("Apple", "Banana"))
    println(bag.items)

    bag.items = listOf("Mango", "Kiwi")
    println(bag.items)
}