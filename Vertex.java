package Logic;

public class Vertex {
    private int x;
    private int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCoordinates(int x, int y) {
        setX(x);
        setY(y);
    }
}
