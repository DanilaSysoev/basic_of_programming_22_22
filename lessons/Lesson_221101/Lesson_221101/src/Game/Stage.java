package Game;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    private final String name;
    private final ArrayList<ArrayList<Cell>> map;
    private final String fromStageName;
    private final String toStageName;

    public Stage(
            String name,
            String fromStageName,
            String toStageName,
            List<List<Cell>> map
    ) {
        this.name = name;
        this.fromStageName = fromStageName;
        this.toStageName = toStageName;
        this.map = new ArrayList<>();
        for (var mapLine: map) {
            this.map.add(new ArrayList<>(mapLine));
        }
    }

    public String getName() {
        return name;
    }
    public Cell getCell(int x, int y) {
        return map.get(y).get(x);
    }
    public String getFromStageName() {
        return fromStageName;
    }
    public String getToStageName() {
        return toStageName;
    }
}
