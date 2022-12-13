package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.Housing;
import university.schedule.core.Language;

public class HousingTests extends Assert {
    @Test
    public void crate_createWithNameAndAddress_getNameReturnCorrectName() {
        Housing housing = new Housing("КГФ", "Проспект Вернадского 88");
        assertEquals("КГФ", housing.getName());
    }
    @Test
    public void crate_createWithNameAndAddress_getAddressReturnCorrectName() {
        Housing housing = new Housing("КГФ", "Проспект Вернадского 88");
        assertEquals("Проспект Вернадского 88", housing.getAddress());
    }

    @Test
    public void equals_createTwoLanguagesWithSameNames_equalsTrue() {
        Housing housing1 = new Housing("КГФ", "Проспект Вернадского 88");
        Housing housing2 = new Housing("КГФ", "Проспект Вернадского 88");
        assertTrue(housing1.equals(housing2));
        assertTrue(housing2.equals(housing1));
    }
    @Test
    public void equals_createTwoLanguagesWithDifferentNames_equalsFalse() {
        Housing housing1 = new Housing("КГФ", "Проспект Вернадского 88");
        Housing housing2 = new Housing("Главный корпус", "Малая Пироговская 1");
        assertFalse(housing1.equals(housing2));
        assertFalse(housing2.equals(housing1));
    }
}
