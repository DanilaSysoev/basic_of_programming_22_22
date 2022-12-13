package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.LessonType;

public class LessonTypeTests extends Assert {
    @Test
    public void crate_createWithName_getNameReturnCorrectName() {
        LessonType lessonType = new LessonType("Лекция");
        assertEquals("Лекция", lessonType.getName());
    }

    @Test
    public void equals_createTwoLessonTypesWithSameNames_equalsTrue() {
        LessonType lt1 = new LessonType("Лекция");
        LessonType lt2 = new LessonType("Лекция");
        assertTrue(lt1.equals(lt2));
        assertTrue(lt2.equals(lt1));
    }
    @Test
    public void equals_createTwoLessonTypesWithDifferentNames_equalsFalse() {
        LessonType lt1 = new LessonType("Лекция");
        LessonType lt2 = new LessonType("Семинар");
        assertFalse(lt1.equals(lt2));
        assertFalse(lt2.equals(lt1));
    }
}
