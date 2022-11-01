package Builders;

import Game.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileStageBuilder implements StageBuilder {
    private String dataPath;


    public FileStageBuilder(String dataPath) {
        this.dataPath = dataPath;
    }

    @Override
    public Stage buildStage(String name) {
        try {
            List<List<Cell>> map = readMap(name);
            HashMap<String, String> info = readInfo(name);
            String fromStageName = info.getOrDefault("fromStage", null);
            String toStageName = info.getOrDefault("toStage", null);
            return new Stage(name, fromStageName, toStageName, map);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения уровня");
        }
        return null;
    }

    private HashMap<String, String> readInfo(String stageName) throws FileNotFoundException {
        HashMap<String, String> info = new HashMap<>();
        InputStreamReader reader =
                new InputStreamReader(
                        new FileInputStream(String.format("%s/%s/info.txt", dataPath, stageName))
                );
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(":");
            info.put(tokens[0].strip(), tokens[1].strip());
        }
        return info;
    }

    private List<List<Cell>> readMap(String stageName) throws FileNotFoundException {
        ArrayList<List<Cell>> map = new ArrayList<>();
        InputStreamReader reader =
                new InputStreamReader(
                        new FileInputStream(String.format("%s/%s/map.txt", dataPath, stageName))
                );
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            ArrayList<Cell> mapLine = new ArrayList<>();
            for(int i = 0; i < line.length(); ++i) {
                Cell cell = switch (line.charAt(i)) {
                    case '#' -> new WallCell();
                    case ' ' -> new FreeCell();
                    case 'V' -> new ToNextStageCell();
                    case '^' -> new ToPrevStageCell();
                    default -> throw new IllegalStateException("Неизвестный символ клетки: " + line.charAt(i));
                };
                mapLine.add(cell);
            }
            map.add(mapLine);
        }
        return map;
    }
}
