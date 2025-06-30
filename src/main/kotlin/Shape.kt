interface Shape {

    fun move(dx: Double, dy: Double)

    fun getDefiningPoints(): List<Point>

    fun getAttr(): String
}
