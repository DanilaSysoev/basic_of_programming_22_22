package university.schedule.core;

import java.util.ArrayList;
import java.util.List;

public class HousingCollection {
    private static final List<Housing> housings = new ArrayList<>();

    public static void clear() {
        housings.clear();
    }

    public static int size() {
        return housings.size();
    }

    public static void add(Housing housing) {
        if(!housings.contains(housing))
            housings.add(housing);
    }

    public static boolean contains(Housing housing) {
        return housings.contains(housing);
    }
}
