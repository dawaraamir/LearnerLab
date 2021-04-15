
import learnerlab.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test () {
        Assert.assertEquals("Mikaila", Instructors.getInstance().findById(567).getName());
        Assert.assertEquals("Chad", Instructors.getInstance().findById(765).getName());

    }
}
