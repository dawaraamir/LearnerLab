package learnerlab;

public final class Instructors extends People<Instructor> {
    final static Instructors INSTANCE = new Instructors();

//    private Instructors() {
//        Instructor instructor1 = new Instructor("Mikaila", 567);
//        Instructor instructor2 = new Instructor("Chad", 765);
//
//        personList.add(instructor1);
//        personList.add(instructor2);
//
//    }

    public Instructor[] toArray() {
        Instructor[] result = new Instructor[INSTANCE.Count()];
        int i = 0;
        for (Instructor instructor: INSTANCE) {
            result[i++] = instructor;
        }
        return result;
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
