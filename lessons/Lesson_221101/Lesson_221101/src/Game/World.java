package Game;

import Input.Command;

import java.util.HashMap;
import java.util.List;

public class World {
    private final HashMap<String, Stage> stagesByName;
    private Stage currentStage;
    private Person person;
    private boolean isOver;

    public World(List<Stage> stages, String startStage) {
        stagesByName = new HashMap<>();
        for(var stage: stages)
            stagesByName.put(stage.getName(), stage);
        currentStage = getStage(startStage);
        isOver = false;
    }

    public Stage getStage(String name) {
        return stagesByName.get(name);
    }
    public void applyCommand(Command command) {
        command.applyToWorld(this);
    }
    public Person getPerson() {
        return person;
    }
    public Stage getCurrentStage() {
        return currentStage;
    }
    public boolean isOver() {
        return isOver;
    }
    public void endGame() {
        isOver = true;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public void toNextStage() {
        if(getCurrentStage().getToStageName() == null)
            endGame();
        else {
            Stage nextStage = getStage(getCurrentStage().getToStageName());
            getCurrentStage().getCell(getPerson().getPosition()).removeFromCell(getPerson());
            nextStage.getCell(nextStage.getPersonIn()).addToCell(getPerson());
            getPerson().setPosition(nextStage.getPersonIn());
            currentStage = nextStage;
        }
    }
    public void toPrevStage() {
        if(getCurrentStage().getFromStageName() == null)
            endGame();
        else {
            Stage nextStage = getStage(getCurrentStage().getFromStageName());
            getCurrentStage().getCell(getPerson().getPosition()).removeFromCell(getPerson());
            nextStage.getCell(nextStage.getPersonOut()).addToCell(getPerson());
            getPerson().setPosition(nextStage.getPersonOut());
            currentStage = nextStage;
        }
    }

}
