package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.MonitoringType;
import university.schedule.core.Subject;

public class SubjectTests extends Assert {
    private final MonitoringType exam = new MonitoringType("Экзамен");
    private final MonitoringType test = new MonitoringType("Тест");
    @Test
    public void crate_createWithArgs_getNameReturnCorrectName() {
        Subject housing = new Subject("Программирование", 32, exam);
        assertEquals("Программирование", housing.getName());
    }
    @Test
    public void crate_createWithArgs_getHoursReturnCorrectHours() {
        Subject housing = new Subject("Программирование", 32, exam);
        assertEquals(32, housing.getHours());
    }
    @Test
    public void crate_createWithArgs_getMonitoringTypeReturnCorrectMonitoringType() {
        Subject housing = new Subject("Программирование", 32, exam);
        assertEquals(exam, housing.getMonitoringType());
    }

    @Test
    public void equals_createTwoSubjectsWithSameArgs_equalsTrue() {
        Subject housing1 = new Subject("Программирование", 32, exam);
        Subject housing2 = new Subject("Программирование", 32, exam);
        assertTrue(housing1.equals(housing2));
        assertTrue(housing2.equals(housing1));
    }
    @Test
    public void equals_createTwoLanguagesWithDifferentAll_equalsFalse() {
        Subject housing1 = new Subject("Программирование", 32, exam);
        Subject housing2 = new Subject("История", 64, test);
        assertFalse(housing1.equals(housing2));
        assertFalse(housing2.equals(housing1));
    }
    @Test
    public void equals_createTwoLanguagesWithDifferentName_equalsFalse() {
        Subject housing1 = new Subject("Программирование", 32, exam);
        Subject housing2 = new Subject("История", 32, exam);
        assertFalse(housing1.equals(housing2));
        assertFalse(housing2.equals(housing1));
    }
    @Test
    public void equals_createTwoLanguagesWithDifferentHours_equalsFalse() {
        Subject housing1 = new Subject("Программирование", 32, exam);
        Subject housing2 = new Subject("Программирование", 64, exam);
        assertFalse(housing1.equals(housing2));
        assertFalse(housing2.equals(housing1));
    }
    @Test
    public void equals_createTwoLanguagesWithDifferentMonitoring_equalsFalse() {
        Subject housing1 = new Subject("Программирование", 32, exam);
        Subject housing2 = new Subject("Программирование", 32, test);
        assertFalse(housing1.equals(housing2));
        assertFalse(housing2.equals(housing1));
    }
}
