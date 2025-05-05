public abstract class Session {
    private int sessionId;
    public Student student;
    public Mentor mentor;
    public String dateTime;
    private static int nextSessionId = 1;


    public Session(Student student, Mentor mentor, String dateTime) {
        this.sessionId = nextSessionId++;
        this.student = student;
        this.mentor = mentor;
        this.dateTime = dateTime;
    }

    public int getSessionId() {
        return sessionId;
    }

    public Student getStudent() {
        return student;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public String getDateTime() {
        return dateTime;
    }

    public abstract String getType();

    public abstract String getDetails();

    @Override
    public String toString() {
        return "Session#" + sessionId + " (" + getType() + " - " + getDetails() +
                ") [Student: " + student.getName() + ", Mentor: " + mentor.getName() + "]";
    }

}
