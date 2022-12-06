package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.Language;

public class LanguageTests extends Assert {
    @Test
    public void crate_createWithName_getNameReturnCorrectName() {
        Language language = new Language("english");
        assertEquals("english", language.getName());
    }

    @Test
    public void equals_createTwoLanguagesWithSameNames_equalsTrue() {
        Language lang1 = new Language("english");
        Language lang2 = new Language("english");
        assertTrue(lang1.equals(lang2));
        assertTrue(lang2.equals(lang1));
    }
}
