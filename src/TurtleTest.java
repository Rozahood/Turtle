import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import javax.swing.text.Position;

import static javax.swing.SwingConstants.*;
import static org.testng.AssertJUnit.*;

public class TurtleTest {
    private Turtle turtle = new Turtle();

    @Test
    public void turtleCanMovePenDownTest() {
        assertTrue(turtle.penIsUp());
        turtle.penDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void turtleCanMovePenUpTest() {
        turtle.penDown();
        assertFalse(turtle.penIsUp());

        turtle.penUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {

        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingNorthTest() {
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLefttWhileFacingEastTest() {
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLefttWhileFacingNorthTest() {
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
}
    //todo add turn left for east, west and south

   /* @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        assertEquals(new Position(0,5), turtle.getPosition());

        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getPosition());
    } */
