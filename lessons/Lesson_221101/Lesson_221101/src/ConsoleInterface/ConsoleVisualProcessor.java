package ConsoleInterface;

import Game.Cell;
import Game.Position;
import Game.World;
import Visual.VisualProcessor;

public class ConsoleVisualProcessor implements VisualProcessor {
    @Override
    public void draw(World world) {
        for(int y = 0; y < world.getCurrentStage().getHeight(); ++y) {
            for(int x = 0; x < world.getCurrentStage().getWidth(); ++x) {
                if(world.getPerson().getPosition().equals(new Position(x, y)))
                    drawPerson();
                else
                    world.getCurrentStage().getCell(x, y).draw(this);
            }
            System.out.println();
        }
    }

    @Override
    public void drawWallCell() {
        System.out.print('#');
    }
    @Override
    public void drawFreeCell() {
        System.out.print('.');
    }
    @Override
    public void drawToNextStageCell() {
        System.out.print('V');
    }
    @Override
    public void drawToPrevStageCell() {
        System.out.print('^');
    }

    public void drawPerson() {
        System.out.print('@');
    }
}
