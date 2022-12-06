package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.Language;
import university.schedule.core.LanguageCollection;

public class LanguageTests extends Assert {
    // nameMethod_situation_expectedResult
    @Test
    public void add_addIntoEmptyCollection_countEqualsOne() {
        assertEquals(0, LanguageCollection.size());
        LanguageCollection.add(new Language("english"));
        assertEquals(1, LanguageCollection.size());
    }
    @Test
    public void add_addIntoEmptyCollection_collectionContainsCorrectLanguage() {
        Language language = new Language("english");
        assertFalse(LanguageCollection.contains(language));
        LanguageCollection.add(language);
        assertTrue(LanguageCollection.contains(language));
    }
}
