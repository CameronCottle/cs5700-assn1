import kotlin.math.abs

// open class to allow square to extend it
open class Rectangle(private val pointA: Point, private val pointB: Point) : Shape {

    init {
        val width = abs(pointB.getX() - pointA.getX())
        val height = abs(pointB.getY() - pointA.getY())
        require(width != 0.0 && height != 0.0) {
            "Rectangle cannot have width or height of 0."
        }
    }

    // get the area of the rectangle
    fun getArea(): Double {
        val width = abs(pointB.getX() - pointA.getX())
        val height = abs(pointB.getY() - pointA.getY())
        return width * height
    }

    // move the rectangle
    override fun move(dx: Double, dy: Double) {
        pointA.move(dx, dy)
        pointB.move(dx, dy)
    }

    // get the defining points of the rectangle
    override fun getAttr(): List<Point> {
        return listOf(pointA.clone(), pointB.clone())
    }
}