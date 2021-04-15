import learnerlab.Educator;
import learnerlab.Student;
import learnerlab.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.Mikaila instanceof Teacher);
    }

    @Test
    public void getTimeWorked() {
        Student student1 = new Student("Dawar", 123);
        Student student2 = new Student("Jared", 321);
        Student[] students = {student1,student2};

        Educator.Mikaila.lecture(students,20);
        Double expected = 20.0;
        Double actual = Educator.Mikaila.getTimeWorked();

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void teach() {
        //each student
        Student student1 = new Student("Dawar", 123);
        Educator.Chad.teach(student1,10);

        double expected = 10.0;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void lecture() {
        Student student1 = new Student("Dawar", 123);
        Student student2 = new Student("Jared", 321);
        Student[] students = {student1,student2};

        Educator.Chad.lecture(students,90);

        double expected = 45;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }
}
