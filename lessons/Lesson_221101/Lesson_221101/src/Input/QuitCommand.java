package Input;

import Game.World;

public class QuitCommand implements Command {
    @Override
    public void applyToWorld(World world) {
        world.endGame();
    }
}
