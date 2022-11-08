package Visual;

import Game.World;

public interface VisualProcessor {
    void draw(World world);

    void drawWallCell();
    void drawFreeCell();
    void drawToNextStageCell();
    void drawToPrevStageCell();
}
