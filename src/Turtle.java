
// import static javax.swing.SwingConstants.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = Direction.EAST;
    private Positions positions = new Positions(0,0);
    public boolean penIsUp(){
        return penIsUp;
    }
    public boolean penDown(){return penIsUp;}
    public void penUp() { penIsUp = true;}
    public Direction getCurrentDirection() {return direction;}
    public void turnRight() {
        if (direction == Direction.SOUTH) face(Direction.WEST);
        if (direction == Direction.EAST) face(Direction.SOUTH);
        if (direction == Direction.NORTH) face(Direction.EAST);
        if (direction == Direction.WEST) face(Direction.NORTH);
    }
    private void face(Direction direction){ this.direction = direction;}

    public void turnLeft() {
        if (direction == Direction.EAST) face(Direction.WEST);
        if (direction == Direction.SOUTH) face(Direction.EAST);
    }
}
