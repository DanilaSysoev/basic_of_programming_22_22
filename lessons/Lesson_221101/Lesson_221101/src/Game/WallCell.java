package Game;

import Visual.VisualProcessor;

public class WallCell implements Cell {
    @Override
    public void addToCell(GameObject object) {}
    @Override
    public void removeFromCell(GameObject object) {}

    @Override
    public boolean isPassable() {
        return false;
    }

    @Override
    public void draw(VisualProcessor visualProcessor) {
        visualProcessor.drawWallCell();
    }
}
