package learnerlab;

import java.util.Arrays;
import java.util.HashMap;


public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static void hostLecture(Teacher teacher, double numberOfHours) {
//        Learner[] newArr = Arrays.copyOf(students.toArray(), students.Count(), Learner[].class);
//        teacher.lecture(newArr, numberOfHours);
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        //Teacher teacher = (Teacher) instructors.findByID(id);
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public HashMap getStudyMap() {
        HashMap<Student, Double> studyMap = new HashMap<>();
//        for (Object student : students.toArray()) {
//            studyMap.put((Student) student,((Student) student).getTotalStudyTime());
        for (Student student : students.toArray()) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }
}
