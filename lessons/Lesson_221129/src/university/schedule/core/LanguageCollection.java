package university.schedule.core;

import java.util.ArrayList;
import java.util.List;

public class LanguageCollection {
    private static final List<Language> languages = new ArrayList<>();

    public static int size() {
        return languages.size();
    }

    public static void add(Language language) {
        if(!languages.contains(language))
            languages.add(language);
    }

    public static boolean contains(Language language) {
        return languages.contains(language);
    }

    public static void clear() {
        languages.clear();
    }
}
