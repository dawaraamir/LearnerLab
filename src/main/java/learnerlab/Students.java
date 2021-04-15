package learnerlab;

public final class Students extends People<Student>{
    final static Students INSTANCE = new Students();
    //private Student [] studentsArrray;

    public Student[] toArray() {
        Student[] result = new Student[INSTANCE.Count()];
        int i = 0;
        for (Student student: INSTANCE) {
            result[i++] = student;
        }
        return result;
    }

//    private Students() {
//        Student studentOne = new Student("Dawar", 123);
//        Student studentTwo = new Student("Jared", 321);
//        Student studentThree = new Student("Mike", 213);
//        Student studentFour = new Student("Hunter", 231);
//        Student studentFive = new Student("Jules", 345);
//
//        studentsArrray = new Student[] {studentOne, studentTwo, studentThree, studentFour, studentFive};
//    }

    public static Students getInstance() {
        return INSTANCE;
    }

//    public Student[] getStudentsArrray() {
//        return studentsArrray;
//    }


}
