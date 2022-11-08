package ConsoleInterface;

import Builders.FileStageBuilder;
import Builders.FileWorldBuilder;
import Builders.StageBuilder;
import Builders.WorldBuilder;
import Game.Cell;
import Game.Game;
import Game.Person;
import Game.World;
import Input.CommandProvider;
import Visual.VisualProcessor;

public class ConsoleRunner {
    public static void main(String[] args) {
        VisualProcessor visualProcessor = new ConsoleVisualProcessor();
        CommandProvider commandProvider = new ConsoleCommandProvider(System.in);
        StageBuilder stageBuilder = new FileStageBuilder("data");
        WorldBuilder worldBuilder = new FileWorldBuilder("data", stageBuilder);

        World world = worldBuilder.buildWorld();
        Person person = new Person("Sam");
        world.setPerson(person);
        Cell startCell = world.getCurrentStage().getCell(world.getCurrentStage().getPersonIn());
        person.setPosition(world.getCurrentStage().getPersonIn());
        startCell.addToCell(person);

        Game game = new Game(world, commandProvider, visualProcessor);
        game.run();
    }
}
