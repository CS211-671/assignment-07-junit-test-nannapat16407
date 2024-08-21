package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList studentList;


    @BeforeEach
    void init() {
        studentList = new StudentList();
        studentList.addNewStudent("6610450960", "Nanna", 90);
    }


    @Test
    @DisplayName("ทดสอบ addNewStudent()")
    void testAddNewStudent() {
        //studentList.addNewStudent("6610450960", "Nanna");
        assertEquals(1, studentList.getStudents().size());
        studentList.addNewStudent("6610450961", "P", 90);
        assertEquals(2, studentList.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบ findStudentById()")
    void testFindStudentById() {
        //studentList.addNewStudent("6610450960", "Nanna");
        assertEquals("Nanna", studentList.findStudentById("6610450960").getName());
    }

    @Test
    @DisplayName("ทดสอบ giveScoreToId()")
    void testGiveScoreToId() {
        studentList.giveScoreToId("6610450960", 10);
       assertEquals(100.0,studentList.findStudentById("6610450960").getScore());
    }

    @Test
    @DisplayName("ทดสอบ viewGradeOfId()")
    void testViewGradeOfId() {
        assertEquals("A", studentList.viewGradeOfId("6610450960"));

    }

    @Test
    @DisplayName("ทดสอบ getStudents()")
    void testGetStudents() {
        assertEquals(1, studentList.getStudents().size());
    }
}