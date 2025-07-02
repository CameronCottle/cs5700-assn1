import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CircleTest {
    @Test
    fun `test circle creation with valid radius`() {
        // create a circle
        val circle = Circle(Point(0.0, 0.0), 2.0)
        assertEquals(Math.PI * 4.0, circle.getArea())
    }

    @Test
    fun `test circle creation with zero radius throws exception`() {
        // create a circle with a radius of 0
        assertThrows<IllegalArgumentException> {
            Circle(Point(0.0, 0.0), 0.0)
        }
    }

    @Test
    fun `test circle movement`() {
        // create and move a circle
        val circle = Circle(Point(0.0, 0.0), 2.0)
        circle.move(1.0, 1.0)
        val center = circle.getAttr()[0]
        assertEquals(1.0, center.getX())
        assertEquals(1.0, center.getY())
    }
}
