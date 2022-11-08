package Game;

import Visual.VisualProcessor;

public class ToNextStageCell implements Cell {
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
        visualProcessor.drawToNextStageCell();
    }
    @Override
    public void activationOnStep(World world) {
        world.toNextStage();
    }
}
