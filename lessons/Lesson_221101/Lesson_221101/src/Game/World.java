package Game;

import Input.Command;

import java.util.HashMap;
import java.util.List;

public class World {
    private final HashMap<String, Stage> stagesByName;
    private Stage currentStage;

    public World(List<Stage> stages, String startStage) {
        stagesByName = new HashMap<>();
        for(var stage: stages)
            stagesByName.put(stage.getName(), stage);
        currentStage = getStage(startStage);
    }

    public Stage getStage(String name) {
        return stagesByName.get(name);
    }
    public void applyCommand(Command command) {
        command.applyToWorld(this);
    }
}
