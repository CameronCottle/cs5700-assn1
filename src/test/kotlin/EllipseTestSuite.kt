import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class EllipseTest {
    @Test
    fun `test ellipse creation with valid radii`() {
        // create an ellipse with an area PI6
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        assertEquals(Math.PI * 2.0 * 3.0, ellipse.getArea())
    }

    @Test
    fun `test ellipse creation with zero radius throws exception`() {
        // create a ellipse with a radius of zero
        assertThrows<IllegalArgumentException> {
            Ellipse(Point(0.0, 0.0), 0.0, 2.0)
        }
    }

    @Test
    fun `test ellipse movement`() {
        // create and move an ellipse
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        ellipse.move(1.0, 1.0)
        val center = ellipse.getAttr()[0]
        assertEquals(1.0, center.getX())
        assertEquals(1.0, center.getY())
    }
}
