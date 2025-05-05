public class SubjectSession extends Session{
    public String subjectName;

    public SubjectSession(Student student, Mentor mentor, String subject) {
        super(student, mentor);
        this.subjectName = subjectName;
    }

    @Override
    public String getType() {
        return "Subject 1-to-1";
    }

    @Override
    public String getDetails() {
        return "Subject: " + subjectName;
    }
}
