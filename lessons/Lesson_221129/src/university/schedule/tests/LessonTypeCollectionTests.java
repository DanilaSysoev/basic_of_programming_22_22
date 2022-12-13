package university.schedule.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import university.schedule.core.LessonType;
import university.schedule.core.LessonTypeCollection;

public class LessonTypeCollectionTests extends Assert {
    @Before
    public void setup() {
        LessonTypeCollection.clear();
    }

    // nameMethod_situation_expectedResult
    @Test
    public void add_addIntoEmptyCollection_sizeEqualsOne() {
        assertEquals(0, LessonTypeCollection.size());
        LessonTypeCollection.add(new LessonType("Лекция"));
        assertEquals(1, LessonTypeCollection.size());
    }
    @Test
    public void add_addIntoCollection_sizeIncrease() {
        int oldSize = LessonTypeCollection.size();
        LessonTypeCollection.add(new LessonType("Лекция"));
        assertEquals(oldSize + 1, LessonTypeCollection.size());
    }
    @Test
    public void add_addIntoEmptyCollection_collectionContainsCorrectLessonType() {
        LessonType lessonType = new LessonType("Лекция");
        assertFalse(LessonTypeCollection.contains(lessonType));
        LessonTypeCollection.add(lessonType);
        assertTrue(LessonTypeCollection.contains(lessonType));
    }
    @Test
    public void add_addOneFromTwo_containsOnlyAdded() {
        LessonType lt1 = new LessonType("Лекция");
        LessonType lt2 = new LessonType("Семинар");
        assertFalse(LessonTypeCollection.contains(lt1));
        assertFalse(LessonTypeCollection.contains(lt2));
        LessonTypeCollection.add(lt1);
        assertTrue(LessonTypeCollection.contains(lt1));
        assertFalse(LessonTypeCollection.contains(lt2));
    }
    @Test
    public void add_addTwoSameLessonTypes_sizeEqualsOne() {
        LessonType lt1 = new LessonType("Лекция");
        LessonType lt2 = new LessonType("Лекция");
        assertFalse(LessonTypeCollection.contains(lt1));
        assertFalse(LessonTypeCollection.contains(lt2));
        LessonTypeCollection.add(lt1);
        LessonTypeCollection.add(lt2);
        assertEquals(1, LessonTypeCollection.size());
    }

    @Test
    public void clear_addOneItemThenClear_sizeEqualsZero() {
        LessonTypeCollection.add(new LessonType("Лекция"));
        LessonTypeCollection.clear();
        assertEquals(0, LessonTypeCollection.size());
    }
}
