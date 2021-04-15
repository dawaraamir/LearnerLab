import learnerlab.*;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    //    @Test
//    public void testHostLecture() {
//        ZipCodeWilmington myCohort = ZipCodeWilmington.getINSTANCE();
//        Instructors instructors = Instructors.getInstance();
//        //myCohort.hostLecture.instructors.findById(567), 20.0);
//        myCohort.hostLecture(instructors.findById(567), 20.0);
//        Student student1 = new Student("Dawar", 123);
//        ((Teacher) instructors.findById(567)).teach(student1, 20.0);
//        Assert.assertEquals(20, student1.getTotalStudyTime(),0);
//    }

    @Test
    public void testHostLecture() {

        Students cohort = Students.getInstance();
        Instructors teachers = Instructors.getInstance();

        Student student1 = new Student("Dawar", 123);
        Student student2 = new Student("Jared", 321);
        Student student3 = new Student("Hunter", 213);

        Instructor instructor1 = new Instructor("Mikaila", 456);
        Instructor instructor2 = new Instructor("Chad", 654);

        cohort.add(student1);
        cohort.add(student2);
        cohort.add(student3);

        teachers.add(instructor1);
        teachers.add(instructor2);

        ZipCodeWilmington testZCW = new ZipCodeWilmington();

        testZCW.hostLecture(instructor2,90);

        Double expected = 30.0;
        Double actual;
        for (Student eachStudent : cohort){
            actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }
    }
}
