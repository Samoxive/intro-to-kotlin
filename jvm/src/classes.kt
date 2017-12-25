// We can specify a constructor right next to the class definition
// this allows us to
class Point(val x: Int, val y: Int)

fun main(args: Array<String>) {
    val p = Point(1, 2)
}