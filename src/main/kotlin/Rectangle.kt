import kotlin.math.abs

// open class to allow square to extend it
open class Rectangle(private val bottomLeft: Point, private val topRight: Point) : Shape, HasArea {

    init {
        val width = abs(topRight.getX() - bottomLeft.getX())
        val height = abs(topRight.getY() - bottomLeft.getY())
        require(width != 0.0 && height != 0.0) {
            "Rectangle cannot have width or height of 0."
        }
    }

    // get the area of the rectangle
    override fun getArea(): Double {
        val width = abs(topRight.getX() - bottomLeft.getX())
        val height = abs(topRight.getY() - bottomLeft.getY())
        return width * height
    }

    // move the rectangle
    override fun move(dx: Double, dy: Double) {
        bottomLeft.move(dx, dy)
        topRight.move(dx, dy)
    }

    // get the defining points of the rectangle
    override fun getAttr(): List<Point> {
        return listOf(bottomLeft.clone(), topRight.clone())
    }
}