package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.MonitoringType;

public class MonitoringTypeTests extends Assert {
    @Test
    public void crate_createWithName_getNameReturnCorrectName() {
        MonitoringType monitoringType = new MonitoringType("Зачет");
        assertEquals("Зачет", monitoringType.getName());
    }

    @Test
    public void equals_createTwoMonitoringTypesWithSameNames_equalsTrue() {
        MonitoringType mt1 = new MonitoringType("Зачет");
        MonitoringType mt2 = new MonitoringType("Зачет");
        assertTrue(mt1.equals(mt2));
        assertTrue(mt2.equals(mt1));
    }
    @Test
    public void equals_createTwoMonitoringTypesWithDifferentNames_equalsFalse() {
        MonitoringType mt1 = new MonitoringType("Зачет");
        MonitoringType mt2 = new MonitoringType("Экзамен");
        assertFalse(mt1.equals(mt2));
        assertFalse(mt2.equals(mt1));
    }
}
