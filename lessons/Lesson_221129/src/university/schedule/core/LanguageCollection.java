package university.schedule.core;

public class LanguageCollection {
    private static int size = 0;

    public static int size() {
        return size;
    }

    public static void add(Language language) {
        ++size;
    }
}
