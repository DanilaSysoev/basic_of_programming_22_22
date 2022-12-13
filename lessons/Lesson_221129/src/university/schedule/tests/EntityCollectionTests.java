package university.schedule.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import university.schedule.core.EntityCollection;
import university.schedule.core.MonitoringType;

public class EntityCollectionTests extends Assert {
    private EntityCollection<MonitoringType> entities;
    @Before
    public void setup() {
        entities = new EntityCollection<>();
    }

    @Test
    public void add_addIntoEmptyCollection_sizeEqualsOne() {
        assertEquals(0, entities.size());
        entities.add(new MonitoringType("Зачет"));
        assertEquals(1, entities.size());
    }
    @Test
    public void add_addIntoCollection_sizeIncrease() {
        int oldSize = entities.size();
        entities.add(new MonitoringType("Зачет"));
        assertEquals(oldSize + 1, entities.size());
    }
    @Test
    public void add_addIntoEmptyCollection_collectionContainsCorrectMonitoringType() {
        MonitoringType lessonType = new MonitoringType("Зачет");
        assertFalse(entities.contains(lessonType));
        entities.add(lessonType);
        assertTrue(entities.contains(lessonType));
    }
    @Test
    public void add_addOneFromTwo_containsOnlyAdded() {
        MonitoringType mt1 = new MonitoringType("Зачет");
        MonitoringType mt2 = new MonitoringType("Экзамен");
        assertFalse(entities.contains(mt1));
        assertFalse(entities.contains(mt2));
        entities.add(mt1);
        assertTrue(entities.contains(mt1));
        assertFalse(entities.contains(mt2));
    }
    @Test
    public void add_addTwoSameMonitoringTypes_sizeEqualsOne() {
        MonitoringType mt1 = new MonitoringType("Зачет");
        MonitoringType mt2 = new MonitoringType("Зачет");
        assertFalse(entities.contains(mt1));
        assertFalse(entities.contains(mt2));
        entities.add(mt1);
        entities.add(mt2);
        assertEquals(1, entities.size());
    }

    @Test
    public void clear_addOneItemThenClear_sizeEqualsZero() {
        entities.add(new MonitoringType("Зачет"));
        entities.clear();
        assertEquals(0, entities.size());
    }
}
