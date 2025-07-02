import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class LineTest {
    @Test
    fun `test line creation with valid points`() {
        // create a start and end point, then create the line with them
        val start = Point(0.0, 0.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)

        // test the length of the line
        assertEquals(5.0, line.getLength())
    }

    @Test
    fun `test line creation with zero length throws exception`() {
        // create a line where the start and end are the same point
        val point = Point(1.0, 1.0)

        // test that an exception is thrown
        assertThrows<IllegalArgumentException> {
            Line(point, Point(1.0, 1.0))
        }
    }

    @Test
    fun `test line slope`() {
        // create a line with a slope of one
        val line1 = Line(Point(0.0, 0.0), Point(1.0, 1.0))
        assertEquals(1.0, line1.getSlope())

        // create a line with a slope of null (its vertical)
        val verticalLine = Line(Point(1.0, 0.0), Point(1.0, 1.0))
        assertEquals(null, verticalLine.getSlope())
    }

    @Test
    fun `test line movement`() {
        // create the line
        val start = Point(0.0, 0.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)

        // move the line
        line.move(1.0, 1.0)
        val points = line.getAttr()

        // test the x and y of each point
        assertEquals(1.0, points[0].getX())
        assertEquals(1.0, points[0].getY())
        assertEquals(4.0, points[1].getX())
        assertEquals(5.0, points[1].getY())
    }
}
