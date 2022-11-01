package Builders;

import Game.Stage;
import Game.World;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWorldBuilder implements WorldBuilder {
    private final String dataPath;
    private final StageBuilder stageBuilder;

    public FileWorldBuilder(String dataPath, StageBuilder stageBuilder){
        this.dataPath = dataPath;
        this.stageBuilder = stageBuilder;
    }

    @Override
    public World buildWorld() {
        try {
            List<String> stagesNames = readStagesNames();
            String startStageName = readStartStageName();
            List<Stage> stages = buildStages(stagesNames);
            return new World(stages, startStageName);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка построения мира.");
        }
        return null;
    }

    private List<Stage> buildStages(List<String> stagesNames) {
        ArrayList<Stage> stages = new ArrayList<>();
        for(var stageName: stagesNames)
            stages.add(stageBuilder.buildStage(stageName));
        return stages;
    }

    private String readStartStageName() throws FileNotFoundException {
        InputStreamReader reader =
                new InputStreamReader(
                        new FileInputStream(dataPath + "/world.txt")
                );
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.equals(""))
                break;
        }
        String stageNameLine = scanner.nextLine();
        return stageNameLine.split(" ")[1];
    }

    private List<String> readStagesNames() throws FileNotFoundException {
        ArrayList<String> stagesNames = new ArrayList<>();
        InputStreamReader reader =
            new InputStreamReader(
                new FileInputStream(dataPath + "/world.txt")
            );
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.equals(""))
                break;
            stagesNames.add(line);
        }
        return stagesNames;
    }
}
