package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.Group;

public class GroupTests extends Assert {
    @Test
    public void crate_createWithArguments_gettersReturnCorrect() {
        Group group = new Group(123, 2021, "Инфоматика");
        assertEquals(123, group.getNumber());
        assertEquals(2021, group.getYear());
        assertEquals("Инфоматика", group.getDirection());
    }
    @Test
    public void equals_createTwoEqualsGroups_equalsTrue() {
        Group group1 = new Group(123, 2021, "Инфоматика");
        Group group2 = new Group(123, 2021, "Инфоматика");
        assertTrue(group1.equals(group2));
        assertTrue(group2.equals(group1));
    }
    @Test
    public void equals_createWithDifferentNumber_equalsFalse() {
        Group group1 = new Group(122, 2021, "Инфоматика");
        Group group2 = new Group(123, 2021, "Инфоматика");
        assertFalse(group1.equals(group2));
        assertFalse(group2.equals(group1));
    }
    @Test
    public void equals_createWithDifferentYear_equalsFalse() {
        Group group1 = new Group(123, 2022, "Инфоматика");
        Group group2 = new Group(123, 2021, "Инфоматика");
        assertFalse(group1.equals(group2));
        assertFalse(group2.equals(group1));
    }
    @Test
    public void equals_createWithDifferentDirection_equalsFalse() {
        Group group1 = new Group(123, 2022, "Инфоматика");
        Group group2 = new Group(123, 2021, "Иностранный язык");
        assertFalse(group1.equals(group2));
        assertFalse(group2.equals(group1));
    }
}
