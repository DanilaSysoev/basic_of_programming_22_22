package Game;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Position otherPos))
            return false;
        return x == otherPos.x && y == otherPos.y;
    }
}
