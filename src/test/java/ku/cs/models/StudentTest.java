package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeEach
    void init() {
        s = new Student("6xxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        //Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(40.05);
        assertEquals(40.05, s.getScore());
        s.addScore(10.00);
        assertEquals(50.05, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }


    @Test
    @DisplayName("ทดสอบ changeName()")
    void testChangeName() {
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.changeName("Pim");
        assertEquals("Pim", s.getName());
    }

    @Test
    @DisplayName("ทดสอบ isId()")
    void testIsId() {
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertTrue(s.isId("6xxxxxxxx"));
        assertFalse(s.isId("6610450960"));
    }

    @Test
    @DisplayName("ทดสอบ getId()")
    void testGetId() {
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertEquals("6xxxxxxxx", s.getId());
    }

    @Test
    @DisplayName("ทดสอบ getName()")
    void testGetName() {
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertEquals("StudentTest", s.getName());
    }

    @Test
    @DisplayName("ทดสอบ getScore()")
    void testGetScore() {
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals(85, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบ testToString()")
    void testToString() {
        //Student s = new Student("6xxxxxxxxx", "StudentTest");
        assertEquals("{id: '6xxxxxxxx', name: 'StudentTest', score: 0.0}", s.toString());
    }
}