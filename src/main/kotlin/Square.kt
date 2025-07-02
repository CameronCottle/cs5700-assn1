import kotlin.math.abs

// extending the rectangle class, which inherits the Shape and HasArea interface
class Square(pointA: Point, pointB: Point) : Rectangle(pointA, pointB) {
    init {
        val width = abs(pointB.getX() - pointA.getX())
        val height = abs(pointB.getY() - pointA.getY())
        require(width == height) { "Square must have equal width and height." }
    }
}