package ConsoleInterface;

import Game.Direction;
import Input.Command;
import Input.CommandProvider;
import Input.MoveCommand;
import Input.QuitCommand;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleCommandProvider implements CommandProvider {
    private final Scanner scanner;
    public ConsoleCommandProvider(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }
    @Override
    public Command getCommand() {
        if(!scanner.hasNext())
            return null;

        String commandText = scanner.nextLine();
        return switch (commandText.toLowerCase()) {
            case "w" -> new MoveCommand(Direction.Up);
            case "a" -> new MoveCommand(Direction.Left);
            case "s" -> new MoveCommand(Direction.Down);
            case "d" -> new MoveCommand(Direction.Right);
            case "q" -> new QuitCommand();
            default -> null;
        };
    }
}
