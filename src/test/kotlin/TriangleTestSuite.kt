import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class TriangleTest {
    @Test
    fun `test triangle creation with valid points`() {
        // create a triangle
        val triangle = Triangle(
            Point(0.0, 0.0),
            Point(1.0, 0.0),
            Point(0.0, 1.0)
        )
        assertEquals(0.5, triangle.getArea())
    }

    @Test
    fun `test triangle creation with collinear points throws exception`() {
        // try to create a triangle with that has collinear with points
        assertThrows<IllegalArgumentException> {
            Triangle(
                Point(0.0, 0.0),
                Point(1.0, 1.0),
                Point(2.0, 2.0)
            )
        }
    }

    @Test
    fun `test triangle movement`() {
        // create a triangle and move it
        val triangle = Triangle(
            Point(0.0, 0.0),
            Point(1.0, 0.0),
            Point(0.0, 1.0)
        )
        triangle.move(1.0, 1.0)
        val points = triangle.getAttr()
        assertEquals(1.0, points[0].getX())
        assertEquals(1.0, points[0].getY())
        assertEquals(2.0, points[1].getX())
        assertEquals(1.0, points[1].getY())
        assertEquals(1.0, points[2].getX())
        assertEquals(2.0, points[2].getY())
    }
}
