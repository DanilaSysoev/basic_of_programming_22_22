package Game;

import Input.Command;
import Input.CommandProvider;
import Visual.VisualProcessor;

public class Game {
    private final World world;
    private final CommandProvider commandProvider;
    private final VisualProcessor visualProcessor;

    public Game(
        World world,
        CommandProvider commandProvider,
        VisualProcessor visualProcessor
    ) {
        this.world = world;
        this.commandProvider = commandProvider;
        this.visualProcessor = visualProcessor;
    }

    public void run() {
        while (!world.isOver()) {
            visualProcessor.draw(world);
            Command command = commandProvider.getCommand();
            if(command != null)
                command.applyToWorld(world);
        }
    }
}
