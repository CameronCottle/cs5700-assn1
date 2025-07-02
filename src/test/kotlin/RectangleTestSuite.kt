import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class RectangleTest {
    @Test
    fun `test rectangle creation with valid points`() {
        // create a rectangle
        val rect = Rectangle(Point(0.0, 0.0), Point(2.0, 3.0))
        // test the area
        assertEquals(6.0, rect.getArea())
    }

    @Test
    fun `test rectangle creation with zero width throws exception`() {
        // throw an exception if the width is zero
        assertThrows<IllegalArgumentException> {
            Rectangle(Point(1.0, 1.0), Point(1.0, 2.0))
        }
    }

    @Test
    fun `test rectangle creation with zero height throws exception`() {
        // throw an exception if the height is zero
        assertThrows<IllegalArgumentException> {
            Rectangle(Point(1.0, 1.0), Point(2.0, 1.0))
        }
    }

    @Test
    fun `test rectangle movement`() {
        // create a valid rectangle
        val rect = Rectangle(Point(0.0, 0.0), Point(2.0, 3.0))

        rect.move(1.0, 1.0)
        val points = rect.getAttr()

        // test the move
        assertEquals(1.0, points[0].getX())
        assertEquals(1.0, points[0].getY())
        assertEquals(3.0, points[1].getX())
        assertEquals(4.0, points[1].getY())
    }
}
