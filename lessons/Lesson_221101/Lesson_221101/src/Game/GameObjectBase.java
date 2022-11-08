package Game;

public class GameObjectBase implements GameObject {
    private final long id;
    private final String name;
    private static long currentId = 0;

    public GameObjectBase(String name) {
        this.id = ++currentId;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public long getId() {
        return id;
    }
}
