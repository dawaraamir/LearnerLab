import learnerlab.Person;
import learnerlab.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test () {
        Assert.assertEquals("Dawar", Students.getInstance().findById(123).getName());
        Assert.assertEquals("Jared", Students.getInstance().findById(321).getName());
        Assert.assertEquals("Mike", Students.getInstance().findById(213).getName());
        Assert.assertEquals("Hunter", Students.getInstance().findById(231).getName());
        Assert.assertEquals("Jules", Students.getInstance().findById(345).getName());

    }
}
