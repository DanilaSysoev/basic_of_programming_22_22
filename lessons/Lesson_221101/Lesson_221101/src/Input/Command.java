package Input;

import Game.World;

public interface Command {
    void applyToWorld(World world);
}
