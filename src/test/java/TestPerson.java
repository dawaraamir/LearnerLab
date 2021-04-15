import learnerlab.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
private Person person;
    @Before
    public void setUP() {
        person = new Person("Dawar", 12344);
    }

    @Test
    public void testConstructor() {
        // Given
        person = new Person("Dawar", 123456);
        // When
        long actualId = person.getId();
        String actualName = person.getName();
        // Then
        Assert.assertEquals(person.getId(), actualId);
        Assert.assertEquals(actualName, person.getName());
    }

    @Test
    public void testSetName() {
        // Given
        long expectedID = 0;
        String expectedName = "Dawar";
        String expectedNewName = "Dawar2";
        // When
        person = new Person(expectedName, expectedID);
        person.setName(expectedNewName);
        String actualName = person.getName();
        // Then
        Assert.assertEquals(expectedNewName, actualName);
    }
}
