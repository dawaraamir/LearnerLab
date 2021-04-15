import learnerlab.Person;
import learnerlab.Student;
import learnerlab.Students;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    private Students students;
    private Student student1;
    private Student student2;
    private Student student3;


    @Before
    public void setUp() throws Exception {
        this.students = Students.getInstance();
        student1 = new Student("Dawar", 123);
        student2 = new Student("Jared", 321);
        student3 = new Student("Hunter", 213);
    }
    @Test
    public void add() {
        //Given
        List<Students> studentsList = new ArrayList<>();

        //When
        studentsList.add(students);

        //Then
        Assert.assertTrue("All students should be added", studentsList.contains(students));
    }

    @Test
    public void findById() {
        //Given
      //  Person person = new Person("Jared", 321);

        //When
        student1.getId();

        //Then
        Assert.assertEquals(123, student1.getId());
    }

    @Test
    public void remove() {
        //Given
        //Person person = new Person("Mike", 123);
        //List<Person> personList = new ArrayList<>();
        List<Students> studentsList = new ArrayList<>();

        //When
        studentsList.remove(student1);

        //Then
        Assert.assertFalse(studentsList.contains(student1));
    }
}
