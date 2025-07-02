import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun `test square creation with valid points`() {

        // create a square with an area of 4
        val square = Square(Point(0.0, 0.0), Point(2.0, 2.0))
        assertEquals(4.0, square.getArea())
    }

    @Test
    fun `test square creation with unequal width and height throws exception`() {
        // unequal sides
        assertThrows<IllegalArgumentException> {
            Square(Point(0.0, 0.0), Point(2.0, 3.0))
        }
    }

    @Test
    fun `test square movement`() {

        // create a square and move it
        val square = Square(Point(0.0, 0.0), Point(2.0, 2.0))
        square.move(1.0, 1.0)
        val points = square.getAttr()
        assertEquals(1.0, points[0].getX())
        assertEquals(1.0, points[0].getY())
        assertEquals(3.0, points[1].getX())
        assertEquals(3.0, points[1].getY())
    }
}
