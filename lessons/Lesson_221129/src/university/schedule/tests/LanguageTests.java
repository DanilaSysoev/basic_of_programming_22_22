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
}
