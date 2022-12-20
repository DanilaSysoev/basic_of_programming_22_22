package university.schedule.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import university.schedule.core.EntityCollection;
import university.schedule.core.MonitoringType;

import java.util.List;

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

    @Test
    public void getAll_getFromEmpty_returnEmptyList() {
        List<MonitoringType> types = entities.getAll();
        assertEquals(0, types.size());
    }
    @Test
    public void getAll_addThreeEntities_returnListContainsAll() {
        var mt1 = new MonitoringType("Зачет");
        entities.add(mt1);
        var mt2 = new MonitoringType("Экзамен");
        entities.add(mt2);
        var mt3 = new MonitoringType("Дифф. зачет");
        entities.add(mt3);

        List<MonitoringType> types = entities.getAll();

        assertTrue(types.contains(mt1));
        assertTrue(types.contains(mt2));
        assertTrue(types.contains(mt3));
        assertEquals(3, types.size());
    }
    @Test
    public void getAll_removeOneElemFromLocalList_databaseNotChanged() {
        var mt1 = new MonitoringType("Зачет");
        entities.add(mt1);
        var mt2 = new MonitoringType("Экзамен");
        entities.add(mt2);
        var mt3 = new MonitoringType("Дифф. зачет");
        entities.add(mt3);

        List<MonitoringType> types = entities.getAll();
        types.remove(mt1);

        List<MonitoringType> freshTypes = entities.getAll();

        assertTrue(freshTypes.contains(mt1));
        assertTrue(freshTypes.contains(mt2));
        assertTrue(freshTypes.contains(mt3));
        assertEquals(3, freshTypes.size());
    }
}
