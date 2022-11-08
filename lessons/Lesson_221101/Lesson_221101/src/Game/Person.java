package Game;

import Visual.Drawable;
import Visual.VisualProcessor;

public class Person extends GameObjectBase {
    private String name;
    private Position position;

    public Person(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
}
