import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

class PointTest {
    @Test
    fun `test point creation and attributes`() {
        val point = Point(1.0, 2.0)
        assertEquals(1.0, point.getX())
        assertEquals(2.0, point.getY())
    }

    @Test
    fun `test point clone`() {

        // make a point then clone it
        val original = Point(1.0, 2.0)
        val cloned = original.clone()
        
        // test that the points are the same in the clone and original
        assertEquals(original.getX(), cloned.getX())
        assertEquals(original.getY(), cloned.getY())
        assertNotSame(original, cloned)
    }

    @Test
    fun `test point movement`() {
        val point = Point(1.0, 2.0)

        // move the point by 2 in x and 3 in y
        point.move(2.0, 3.0)

        // test where the point is
        assertEquals(3.0, point.getX())
        assertEquals(5.0, point.getY())
    }
}
