package learnerlab;

public enum Educator implements Teacher{

    Mikaila (new Instructor("Mikaila", 456),0.0),
    Chad (new Instructor("Chad", 678),0.0);


    private final Instructor instructor;
    private double timeWorked;


    Educator(Instructor instructor, double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked() {
        return this.timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners,numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
