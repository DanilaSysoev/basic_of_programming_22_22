package Input;

import Game.Cell;
import Game.Direction;
import Game.Position;
import Game.World;

public class MoveCommand implements Command {
    private final Direction direction;

    public MoveCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void applyToWorld(World world) {
        Position curPos = world.getPerson().getPosition();
        Position newPos = direction.move(curPos);
        Cell newCell = world.getCurrentStage().getCell(newPos);
        if(newCell == null || !newCell.isPassable())
            return;
        Cell curCell = world.getCurrentStage().getCell(curPos);
        curCell.removeFromCell(world.getPerson());
        newCell.addToCell(world.getPerson());
        world.getPerson().setPosition(newPos);
        newCell.activationOnStep(world);
    }
}
