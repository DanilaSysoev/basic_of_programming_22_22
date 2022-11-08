package Game;

import Visual.VisualProcessor;

import java.util.HashMap;

public class FreeCell implements Cell {
    private final HashMap<Long, GameObject> objectsById;

    public FreeCell() {
        objectsById = new HashMap<>();
    }

    @Override
    public void addToCell(GameObject object) {
        objectsById.put(object.getId(), object);
    }
    @Override
    public void removeFromCell(GameObject object) {
        objectsById.remove(object.getId());
    }
    @Override
    public boolean isPassable() {
        return true;
    }

    @Override
    public void draw(VisualProcessor visualProcessor) {
        visualProcessor.drawFreeCell();
    }
}
