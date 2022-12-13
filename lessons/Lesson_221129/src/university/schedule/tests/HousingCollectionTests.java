package university.schedule.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import university.schedule.core.Housing;
import university.schedule.core.HousingCollection;

public class HousingCollectionTests extends Assert {
    @Before
    public void setup() {
        HousingCollection.clear();
    }

    // nameMethod_situation_expectedResult
    @Test
    public void add_addIntoEmptyCollection_sizeEqualsOne() {
        assertEquals(0, HousingCollection.size());
        HousingCollection.add(new Housing("КГФ", "Проспект Вернадского 88"));
        assertEquals(1, HousingCollection.size());
    }
    @Test
    public void add_addIntoCollection_sizeIncrease() {
        int oldSize = HousingCollection.size();
        HousingCollection.add(new Housing("КГФ", "Проспект Вернадского 88"));
        assertEquals(oldSize + 1, HousingCollection.size());
    }
    @Test
    public void add_addIntoEmptyCollection_collectionContainsCorrectHousing() {
        Housing housing = new Housing("КГФ", "Проспект Вернадского 88");
        assertFalse(HousingCollection.contains(housing));
        HousingCollection.add(housing);
        assertTrue(HousingCollection.contains(housing));
    }
    @Test
    public void add_addOneFromTwo_containsOnlyAdded() {
        Housing housing1 = new Housing("КГФ", "Проспект Вернадского 88");
        Housing housing2 = new Housing("Главный корпус", "Малая Пироговская 1");
        assertFalse(HousingCollection.contains(housing1));
        assertFalse(HousingCollection.contains(housing2));
        HousingCollection.add(housing1);
        assertTrue(HousingCollection.contains(housing1));
        assertFalse(HousingCollection.contains(housing2));
    }
    @Test
    public void add_addTwoSameLanguages_sizeEqualsOne() {
        Housing housing1 = new Housing("КГФ", "Проспект Вернадского 88");
        Housing housing2 = new Housing("КГФ", "Проспект Вернадского 88");
        assertFalse(HousingCollection.contains(housing1));
        assertFalse(HousingCollection.contains(housing2));
        HousingCollection.add(housing1);
        HousingCollection.add(housing2);
        assertEquals(1, HousingCollection.size());
    }

    @Test
    public void clear_addOneItemThenClear_sizeEqualsZero() {
        HousingCollection.add(new Housing("КГФ", "Проспект Вернадского 88"));
        HousingCollection.clear();
        assertEquals(0, HousingCollection.size());
    }
}
