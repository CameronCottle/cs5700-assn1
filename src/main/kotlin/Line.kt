import kotlin.math.hypot

class Line(private val start: Point, private val end: Point) : Shape {

    // a line is not allowed to have a length of zero
    init {
        require(!(start.getX() == end.getX() && start.getY() == end.getY())) {
            "A line cannot have zero length."
        }
    }

    // move the line
    override fun move(dx: Double, dy: Double) {
        start.move(dx, dy)
        end.move(dx, dy)
    }

    // get the defining point of the line
    override fun getAttr(): List<Point> {
        return listOf(start.clone(), end.clone())
    }

    // get the length of the line
    fun getLength(): Double {
        val deltaX = end.getX() - start.getX()
        val deltaY = end.getY() - start.getY()
        // the hypot function computes the distance from x to y using sqrt(x^2 + y^2)
        return hypot(deltaX, deltaY)
    }

    // get the slope of the line. returns null if 0
    fun getSlope(): Double? {
        // get the deltaX for slope computation
        val deltaX = end.getX() - start.getX()
        // return null if deltaX is 0 to avoid divide by 0 error
        return if (deltaX == 0.0) null else (end.getY() - start.getY()) / deltaX
    }
}
