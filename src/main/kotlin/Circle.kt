// circle inherits from ellipse, which uses the Shape and HasArea interfaces
class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius) {
    // everything can be reused from Ellipse
}