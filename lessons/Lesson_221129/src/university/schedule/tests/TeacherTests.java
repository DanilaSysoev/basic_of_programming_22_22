package university.schedule.tests;

import org.junit.Assert;
import org.junit.Test;
import university.schedule.core.Teacher;

public class TeacherTests extends Assert {
    @Test
    public void crate_createWithoutDiscord_gettersReturnCorrect() {
        Teacher teacher = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com");
        assertEquals("Иванов И. И.", teacher.getName());
        assertEquals("доцент", teacher.getPost());
        assertEquals("Кандидат ф.м.н.", teacher.getAcademicDegree());
        assertEquals("ivanov.i.i.@gmail.com", teacher.getEmail());
        assertEquals("", teacher.getDiscord());
    }
    @Test
    public void crate_createWithDiscord_gettersReturnCorrect() {
        Teacher teacher = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertEquals("Иванов И. И.", teacher.getName());
        assertEquals("доцент", teacher.getPost());
        assertEquals("Кандидат ф.м.н.", teacher.getAcademicDegree());
        assertEquals("ivanov.i.i.@gmail.com", teacher.getEmail());
        assertEquals("ivanov#0001", teacher.getDiscord());
    }
    @Test
    public void equals_createTwoEqualsTeachers_equalsTrue() {
        Teacher teacher1 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        Teacher teacher2 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertTrue(teacher1.equals(teacher2));
        assertTrue(teacher2.equals(teacher1));
    }
    @Test
    public void equals_createWithDifferentName_equalsFalse() {
        Teacher teacher1 = new Teacher("Петров П. П.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        Teacher teacher2 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertFalse(teacher1.equals(teacher2));
        assertFalse(teacher2.equals(teacher1));
    }
    @Test
    public void equals_createWithDifferentPost_equalsFalse() {
        Teacher teacher1 = new Teacher("Иванов И. И.", "Профессор", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        Teacher teacher2 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertFalse(teacher1.equals(teacher2));
        assertFalse(teacher2.equals(teacher1));
    }
    @Test
    public void equals_createWithDifferentDegree_equalsFalse() {
        Teacher teacher1 = new Teacher("Иванов И. И.", "доцент", "Доктор ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        Teacher teacher2 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertFalse(teacher1.equals(teacher2));
        assertFalse(teacher2.equals(teacher1));
    }
    @Test
    public void equals_createWithDifferentEmail_equalsFalse() {
        Teacher teacher1 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "petrov.i.i.@gmail.com", "ivanov#0001");
        Teacher teacher2 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertFalse(teacher1.equals(teacher2));
        assertFalse(teacher2.equals(teacher1));
    }
    @Test
    public void equals_createWithDifferentDiscord_equalsFalse() {
        Teacher teacher1 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "petrov#0001");
        Teacher teacher2 = new Teacher("Иванов И. И.", "доцент", "Кандидат ф.м.н.", "ivanov.i.i.@gmail.com", "ivanov#0001");
        assertFalse(teacher1.equals(teacher2));
        assertFalse(teacher2.equals(teacher1));

    }

}
