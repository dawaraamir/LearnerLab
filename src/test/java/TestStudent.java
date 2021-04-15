import learnerlab.Learner;
import learnerlab.Person;
import learnerlab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    private Student student;


    @Test
    public void testImplementation() {
        // Given
        // When
        student = new Student("Dawar", 123432423);
        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        // Given
        // When
        student = new Student("Dawar", 123432423);
        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        // Given
        double expectedNewNumberOfHours = 3.0;
        double expectedFinalTotalStudyTime = 6.0;
        // When
        student = new Student("Dawar", 123432423);
        student.learn(expectedNewNumberOfHours);
        double actualFinalTotalStudyTime = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedFinalTotalStudyTime, actualFinalTotalStudyTime, 0.0);
    }
    }
