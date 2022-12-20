package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.Time;

public class TimeTests extends Assert {
    @Test
    public void create_createZeroMinutesAndHours_propertiesReturnsCorrectValues() {
        Time time = new Time(0, 0);
        assertEquals(0, time.getHours());
        assertEquals(0, time.getMinutes());
    }
    @Test
    public void create_createFromMinutesAndHoursInsideRange_propertiesReturnsCorrectValues() {
        Time time = new Time(12, 25);
        assertEquals(12, time.getHours());
        assertEquals(25, time.getMinutes());
    }
    @Test
    public void create_createFromMinutesInsideRange_propertiesReturnsCorrectValues() {
        Time time = new Time(25);
        assertEquals(0, time.getHours());
        assertEquals(25, time.getMinutes());
    }
    @Test
    public void create_createFromMinutesOutsideRange_propertiesReturnsCorrectValues() {
        Time time = new Time(80);
        assertEquals(1, time.getHours());
        assertEquals(20, time.getMinutes());
    }
    @Test
    public void create_createFromHoursOutsideRange_propertiesReturnsCorrectValues() {
        Time time = new Time(40, 22);
        assertEquals(16, time.getHours());
        assertEquals(22, time.getMinutes());
    }
    @Test
    public void create_createWithNegativeHoursAndMinutes_propertiesReturnsCorrectValues() {
        Time time = new Time(-10, -25);
        assertEquals(13, time.getHours());
        assertEquals(35, time.getMinutes());
    }
    @Test
    public void create_createWithNegativeMinutes_propertiesReturnsCorrectValues() {
        Time time = new Time(-25);
        assertEquals(23, time.getHours());
        assertEquals(35, time.getMinutes());
    }
    @Test
    public void create_createWithNegativeMinutesOutside_propertiesReturnsCorrectValues() {
        Time time = new Time(-85);
        assertEquals(22, time.getHours());
        assertEquals(35, time.getMinutes());
    }
    @Test
    public void create_createWithNegativeHoursAndMinutesOutsizeRange_propertiesReturnsCorrectValues() {
        Time time = new Time(-40, -25);
        assertEquals(7, time.getHours());
        assertEquals(35, time.getMinutes());
    }

    @Test
    public void addHours_addZeroHours_timeNotChange() {
        Time time = new Time(10, 25);
        Time timeNew = time.addHours(0);
        assertEquals(10, timeNew.getHours());
        assertEquals(25, timeNew.getMinutes());
    }
    @Test
    public void addHours_addPositiveHoursInsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addHours(2);
        assertEquals(12, timeNew.getHours());
        assertEquals(25, timeNew.getMinutes());
    }
    @Test
    public void addHours_addPositiveHoursOutsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addHours(20);
        assertEquals(6, timeNew.getHours());
        assertEquals(25, timeNew.getMinutes());
    }
    @Test
    public void addHours_addNegativeHoursInsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addHours(-2);
        assertEquals(8, timeNew.getHours());
        assertEquals(25, timeNew.getMinutes());
    }
    @Test
    public void addHours_addNegativeHoursOutsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addHours(-12);
        assertEquals(22, timeNew.getHours());
        assertEquals(25, timeNew.getMinutes());
    }

    @Test
    public void addMinutes_addZeroMinutes_timeNotChange() {
        Time time = new Time(10, 25);
        Time timeNew = time.addMinutes(0);
        assertEquals(10, timeNew.getHours());
        assertEquals(25, timeNew.getMinutes());
    }
    @Test
    public void addMinutes_addPositiveMinutesInsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addMinutes(10);
        assertEquals(10, timeNew.getHours());
        assertEquals(35, timeNew.getMinutes());
    }
    @Test
    public void addMinutes_addPositiveMinutesOutsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addMinutes(50);
        assertEquals(11, timeNew.getHours());
        assertEquals(15, timeNew.getMinutes());
    }
    @Test
    public void addMinutes_addNegativeMinutesInsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addMinutes(-10);
        assertEquals(10, timeNew.getHours());
        assertEquals(15, timeNew.getMinutes());
    }
    @Test
    public void addMinutes_addNegativeMinutesOutsideRange_timeChangeCorrect() {
        Time time = new Time(10, 25);
        Time timeNew = time.addMinutes(-35);
        assertEquals(9, timeNew.getHours());
        assertEquals(50, timeNew.getMinutes());
    }

    @Test
    public void equals_compareEqualsTime_returnTrue() {
        Time t1 = new Time(10, 20);
        Time t2 = new Time(10, 20);

        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));
    }
    @Test
    public void equals_compareEqualsTimesWithDifferentArgs_returnTrue() {
        Time t1 = new Time(34, 20);
        Time t2 = new Time(9, 80);

        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));
    }
    @Test
    public void equals_compareDifferentTimes_returnFalse() {
        Time t1 = new Time(10, 20);
        Time t2 = new Time(11, 21);

        assertFalse(t1.equals(t2));
        assertFalse(t2.equals(t1));
    }

    @Test
    public void toString_createTimeWithTwoDigitsHoursAndMinutes_returnCorrectString() {
        Time t1 = new Time(10, 25);

        assertEquals("10:25", t1.toString());
    }
    @Test
    public void toString_createTimeWithOneDigitsHoursAndMinutes_returnCorrectString() {
        Time t1 = new Time(8, 6);

        assertEquals("08:06", t1.toString());
    }

    @Test
    public void compareTo_compareToDifferentTimes_returnCorrectResult() {
        Time t1 = new Time(8, 6);
        Time t2 = new Time(12, 15);

        assertTrue(t1.compareTo(t2) < 0);
        assertTrue(t2.compareTo(t1) > 0);
    }
    @Test
    public void compareTo_compareToEqualsTimes_returnCorrectResult() {
        Time t1 = new Time(12, 15);
        Time t2 = new Time(12, 15);

        assertTrue(t1.compareTo(t2) == 0);
        assertTrue(t2.compareTo(t1) == 0);
    }



}
