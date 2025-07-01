open class Ellipse(private val center: Point, private val radiiA: Double, private val radiiB: Double) : Shape {

    init {
        require(radiiA > 0 && radiiB > 0) { "Ellipse must have positive radii." }
    }

    fun getArea(): Double {
        return Math.PI * radiiA * radiiB
    }

    override fun move(dx: Double, dy: Double) {
        center.move(dx, dy)
    }

    override fun getAttr(): List<Point> {
        return listOf(center.clone())
    }
}