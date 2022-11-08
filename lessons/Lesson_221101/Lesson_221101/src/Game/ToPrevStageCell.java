package Game;

import Visual.VisualProcessor;

public class ToPrevStageCell implements Cell {
    @Override
    public void addToCell(GameObject object) {

    }

    @Override
    public void removeFromCell(GameObject object) {

    }

    @Override
    public boolean isPassable() {
        return true;
    }

    @Override
    public void draw(VisualProcessor visualProcessor) {
        visualProcessor.drawToPrevStageCell();
    }

    @Override
    public void activationOnStep(World world) {
        world.toPrevStage();
    }
}
