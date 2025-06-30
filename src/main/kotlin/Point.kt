class Point(private var x: Double, private var y: Double): Shape {

    override fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    fun getX(): Double = x
    fun getY(): Double = y


    fun clone(): Point = Point(x, y)

    override fun getAttr(): List<Point> = listOf(this)
}
