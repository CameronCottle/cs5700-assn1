open class Ellipse(private val center: Point, private val semiMajor: Double, private val semiMinor: Double) : Shape, HasArea {

    init {
        require(semiMajor > 0 && semiMinor > 0) { "Ellipse must have positive radii." }
    }

    override fun getArea(): Double {
        return Math.PI * semiMajor * semiMinor
    }

    override fun move(dx: Double, dy: Double) {
        center.move(dx, dy)
    }

    override fun getAttr(): List<Point> {
        return listOf(center.clone())
    }
}