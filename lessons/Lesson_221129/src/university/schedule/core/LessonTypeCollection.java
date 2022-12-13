package university.schedule.core;

import java.util.ArrayList;
import java.util.List;

public class LessonTypeCollection {
    private static final List<LessonType> lessonTypes = new ArrayList<>();

    public static void clear() {
        lessonTypes.clear();
    }

    public static int size() {
        return lessonTypes.size();
    }

    public static void add(LessonType lessonType) {
        if(!lessonTypes.contains(lessonType))
            lessonTypes.add(lessonType);
    }

    public static boolean contains(LessonType lessonType) {
        return lessonTypes.contains(lessonType);
    }
}
