package university.schedule.core;

public class LanguageCollection {
    private static int size = 0;
    private static boolean contains = false;

    public static int size() {
        return size;
    }

    public static void add(Language language) {
        ++size;
        contains = true;
    }

    public static boolean contains(Language language) {
        return contains;
    }

    public static void clear() {

    }
}
