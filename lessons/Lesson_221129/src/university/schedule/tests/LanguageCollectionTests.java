package university.schedule.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import university.schedule.core.Language;
import university.schedule.core.LanguageCollection;

public class LanguageCollectionTests extends Assert {
    @Before
    public void setup() {
        LanguageCollection.clear();
    }

    // nameMethod_situation_expectedResult
    @Test
    public void add_addIntoEmptyCollection_sizeEqualsOne() {
        assertEquals(0, LanguageCollection.size());
        LanguageCollection.add(new Language("english"));
        assertEquals(1, LanguageCollection.size());
    }
    @Test
    public void add_addIntoCollection_sizeIncrease() {
        int oldSize = LanguageCollection.size();
        LanguageCollection.add(new Language("english"));
        assertEquals(oldSize + 1, LanguageCollection.size());
    }
    @Test
    public void add_addIntoEmptyCollection_collectionContainsCorrectLanguage() {
        Language language = new Language("english");
        assertFalse(LanguageCollection.contains(language));
        LanguageCollection.add(language);
        assertTrue(LanguageCollection.contains(language));
    }
    @Test
    public void add_addOneFromTwo_containsOnlyAdded() {
        Language lang1 = new Language("english");
        Language lang2 = new Language("french");
        assertFalse(LanguageCollection.contains(lang1));
        assertFalse(LanguageCollection.contains(lang2));
        LanguageCollection.add(lang1);
        assertTrue(LanguageCollection.contains(lang1));
        assertFalse(LanguageCollection.contains(lang2));
    }
    @Test
    public void add_addTwoSameLanguages_sizeEqualsOne() {
        Language lang1 = new Language("english");
        Language lang2 = new Language("english");
        assertFalse(LanguageCollection.contains(lang1));
        assertFalse(LanguageCollection.contains(lang2));
        LanguageCollection.add(lang1);
        LanguageCollection.add(lang2);
        assertEquals(1, LanguageCollection.size());
    }

    @Test
    public void clear_addOneItemThenClear_sizeEqualsZero() {
        LanguageCollection.add(new Language("english"));
        LanguageCollection.clear();
        assertEquals(0, LanguageCollection.size());
    }
}
