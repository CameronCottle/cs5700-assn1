import kotlin.math.abs

class Triangle(
    private val pointA: Point,
    private val pointB: Point,
    private val pointC: Point
) : Shape {

    init {
        // we are comparing to a small number here because using a double may cause a 
        // really small number, so we can't compare to exactly zero
        require(area() > 1e-10) {
            "Triangle cannot have area 0."
        }
    }

    // private area method to be able to check during initialization
    private fun area(): Double {
        return abs(
            pointA.getX() * (pointB.getY() - pointC.getY()) +
                    pointB.getX() * (pointC.getY() - pointA.getY()) +
                    pointC.getX() * (pointA.getY() - pointB.getY())
        ) / 2.0
    }

    // public area method to get 
    fun getArea(): Double {
        return area()
    }

    // move the triangle
    override fun move(dx: Double, dy: Double) {
        pointA.move(dx, dy)
        pointB.move(dx, dy)
        pointC.move(dx, dy)
    }

    // getAttr
    override fun getAttr(): List<Point> {
        return listOf(pointA.clone(), pointB.clone(), pointC.clone())
    }
}