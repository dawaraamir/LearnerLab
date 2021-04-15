import learnerlab.Instructor;
import learnerlab.Person;
import learnerlab.Student;
import learnerlab.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    private Instructor instructor;
    private Student student;
    private Student[] students;

    @Test
    public void testImplementation(){
        // Given
        // When
        instructor = new Instructor("Mikaila", 232);
        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        // Given
        // When
        instructor = new Instructor("Mikaila", 232);
        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        // Given
        Student student = new Student("Dawar", 124);
        Instructor instructor = new Instructor("Mikaila", 321);
        instructor.teach(student, 3);
        // When
        Double expectedTime = 9.0;
        Double actualTime = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedTime, actualTime);

    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor("Mikaila", 123);
        Student student1 = new Student("Dawar", 12);
        Student student2 = new Student("Jared", 21);
        Student[] students = {student1, student2};

        //When
        instructor.lecture(students, 4);

        //Then
        Assert.assertEquals(4, student1.getTotalStudyTime(), 0);
    }
    }

