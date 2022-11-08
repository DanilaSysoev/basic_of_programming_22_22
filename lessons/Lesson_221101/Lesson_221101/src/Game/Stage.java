package Game;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    private final String name;
    private final ArrayList<ArrayList<Cell>> map;
    private final String fromStageName;
    private final String toStageName;
    private final Position personIn;
    private final Position personOut;

    public Stage(
            String name,
            String fromStageName,
            String toStageName,
            Position personIn,
            Position personOut,
            List<List<Cell>> map
    ) {
        this.name = name;
        this.fromStageName = fromStageName;
        this.toStageName = toStageName;
        this.personIn = personIn;
        this.personOut = personOut;
        this.map = new ArrayList<>();
        for (var mapLine: map) {
            this.map.add(new ArrayList<>(mapLine));
        }
    }

    public String getName() {
        return name;
    }
    public Cell getCell(int x, int y) {
        if(outOfTheMap(x, y))
            return null;

        return map.get(y).get(x);
    }

    private boolean outOfTheMap(int x, int y) {
        return y < 0 || y >= map.size() || x < 0 || x >= map.get(0).size();
    }

    public Cell getCell(Position position) {
        return getCell(position.getX(), position.getY());
    }
    public String getFromStageName() {
        return fromStageName;
    }
    public String getToStageName() {
        return toStageName;
    }
    public int getWidth() {
        return map.get(0).size();
    }
    public int getHeight() {
        return map.size();
    }
    public Position getPersonIn() {
        return personIn;
    }
    public Position getPersonOut() {
        return personOut;
    }
}
